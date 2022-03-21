Models/post.js
var mongoose = require('mongoose');
var PostSchema = new mongoose.Schema({
 title: String,
 body: String
});
module.exports = mongoose.model('Post', PostSchema);
seeds/seed.js
var Post = require('../models/post');
var mongoose = require('mongoose');
var faker = require('faker');
// Establishing connection with the DB
if(process.env.DB_HOST) {
 mongoose.connect(process.env.DB_HOST);
 Post.remove({} , function(){
 console.log('Database Cleared');
 });
 var count = 0;
 var num_records = 100;
 for(var i = 0; i < num_records; i++) {
 Post.create({
 title: faker.random.words(),
 body: faker.lorem.paragraphs()
 }, function(){
 count++;
 if(count >= num_records) {
 mongoose.connection.close();
 console.log("Database Seeded");
 }
 }); 
 }
}
Test/test-server.js
var chai = require('chai');
var chaiHttp = require('chai-http');
var chaiJquery = require('chai-jquery');
var server = require('../app');
var should = chai.should();
chai.use(chaiHttp);
describe('Homepage', function() {
 it('should display the homepage at / GET', function(done) {
 chai.request(server)
 .get('/')
 .end(function(err, res){
 res.should.have.status(200);
 done();
 });
 });
 it('should contain the word Sparta at / GET', function(done) {
 chai.request(server)
 .get('/')
 .end(function(err, res){
 res.text.should.contain('Sparta')
 done();
 });
 });
});
//describe('Blog', function() {
// it('should display the list of posts at /posts GET', function(done) {
// chai.request(server)
// .get('/posts')
// .end(function(err, res){
// res.should.have.status(200);
// done();
// });
// });
//});
describe('Fibonacci', function() {
 it('should display the correct fibonacci value at /fibonacci/10 GET', function(done) {
 chai.request(server)
 .get('/fibonacci/10')
 .end(function(err, res){
 res.should.have.status(200);
 res.text.should.contain('55');
 done();
 });
 });
});
Views/Fibonacci/index.ejs
<!DOCTYPE html>
<html>
<head>
 <title>Provisioning Test Page</title>
 <link href="https://fonts.googleapis.com/css?family=Slabo+27px" rel="stylesheet">
 <style type="text/css">
 body {
 text-align:center;
 font-family: 'Slabo 27px', serif;
 height:100vh;
 }
 .vertical-center {
 position:relative;
 top:50%;
 transform: translateY(-50%);
 }
 img {
 width:100px;
 }
 </style>
</head>
<body>
 <div class="vertical-center">
 <h1>Fibonacci Generator</h1>
 <p>The number at position <%= index %> is <%= value %></p>
 <img src="https://cdn.worldvectorlogo.com/logos/docker.svg" />
 </div>
</body>
</html>
Views/hackable/index.ejs
<!DOCTYPE html>
<html>
<head>
 <title>Provisioning Test Page</title>
 <link href="https://fonts.googleapis.com/css?family=Slabo+27px" rel="stylesheet">
 <style type="text/css">
 body {
 text-align:center;
 font-family: 'Slabo 27px', serif;
 height:100vh;
 }
 .vertical-center {
 position:relative;
 top:50%;
 transform: translateY(-50%);
 }
 img {
 width:100px;
 }
 #command {
 width:50%;
 display: inline-block; 
 }
 #stdout {
 width:50%;
 display: inline-block; 
 }
 </style>
</head>
<body>
 <div class="vertical-center">
 <img src="/images/logo.png" />
 <h1>Hackable: Code Injection</h1>
 <p>The following command was run on the server!</p>
 <code id="command">
 <%= command %>
 </code>
 <p>This was the result</p>
 <code id="stdout">
 <%= stdout %>
 </code>
 </div>
</body>
</html>
Views/post/index.ejs
<!DOCTYPE html>
<html>
<head>
 <title>Provisioning Test Page</title>
 <link href="https://fonts.googleapis.com/css?family=Slabo+27px" rel="stylesheet">
 <style type="text/css">
 body {
 font-family: 'Slabo 27px', serif;
 height:100vh;
 }
 img {
 width:100px;
 }
 .blog {
 padding:50px;
 }
 .post {
 padding:20px;
 }
 </style>
</head>
<body>
 <div class="blog">
 <img src="https://cdn.worldvectorlogo.com/logos/docker.svg" />
 <h1>Recent Posts</h1>
 <hr/>
 <% posts.forEach(function(post){ %>
 <div class="post">
 <h3><%= post.title %></h3>
 <p><%= post.body %></p>
 </div>
 <% }) %>
 </div>
</body>
</html>
Index.ejs
<!DOCTYPE html>
<html>
<head>
 <title>Provisioning Test Page</title>
 <link href="https://fonts.googleapis.com/css?family=Slabo+27px" rel="stylesheet">
 <style type="text/css">
 body {
 text-align:center;
 font-family: 'Slabo 27px', serif;
 height:100vh;
 }
 .vertical-center {
 position:relative;
 top:50%;
 transform: translateY(-50%);
 }
 img {
 width: 150px;
 }
 </style>
</head>
<body>
 <div class="vertical-center">
 <h1>Anais was here</h1>
 <img src="https://cdn.worldvectorlogo.com/logos/docker.svg" />
 <h2>Sparta Docker containerised the image successfully with full automation!</h2>
 
 </div>
</body>
</html>
App.js
var express = require('express');
var app = express();
var exec = require('child_process').exec;
var mongoose = require('mongoose');
var Post = require('./models/post');
app.set('view engine' , 'ejs');
app.use(express.static('public'));
app.get('/' , function(req , res){
 res.render("index");
});
// connect to database
if(process.env.DB_HOST) {
 mongoose.connect(process.env.DB_HOST);
 app.get("/posts" , function(req,res){
 Post.find({} , function(err, posts){
 if(err) return res.send(err);
 res.render("posts/index" , {posts:posts});
 })
 });
}
app.get('/fibonacci/:n' , function(req,res){
 // high cpu usage function
 var value = fibonacci(req.params.n);
 res.render("fibonacci" , {index:req.params.n, value:value});
});
// app.get("/hack/:command" , function(req,res){
// var child = exec(req.params.command, function (error, stdout, stderr) {
// res.render("hackable/index", {stdout:stdout, command:req.params.command});
// });
// });
app.listen(3000 , function(){
 console.log('Your app is ready and listening on port 3000');
});
// deliberately poorly implemented fibonnaci
function fibonacci(n) {
 if(n == 0)
 return 0;
 if(n == 1)
 return 1;
 return fibonacci(n - 1) + fibonacci(n - 2);
}
module.exports = app;
docker-compose.yaml
version: '3'
services: 
 mongo: 
 container_name: mongo
 image: mongo
 restart: always
 ports: 
 - "27017:27017"
 volumes:
 - "./data:/data/db"
 - ./mongod.conf:/etc/mongod.conf
 
 nodejs: 
 build: .
 container_name: dockerised-nodejs
 environment:
 - DB_HOST=mongodb://mongo:27017/posts
 links: 
 - mongo
 ports: 
 - "3000:3000"
 #command: node seeds/seed.js
Dockerfile
# Selecting the base image to build our own customised node.js application microservice
FROM node:latest
# Working directory inside the container
WORKDIR /usr/src/app
# Copying dependencies
COPY package*.json ./
# Installing node package manager
RUN npm install
# Copying everything from current location to default location inside the container
COPY . .
# Second stage of our build for production
#FROM node:alpine
# copy only essential things to this layer
# this line will compress the size and provides full functionality
#COPY --from=app /usr/src/app /usr/src/app
# Define the work directory in the second stage
#WORKDIR /usr/src/app
# Expose the port
EXPOSE 3000
# Starting the app with CMD -
CMD ["node", "app.js"]
Jenkinsfile
pipeline {
 environment {
 registry = "naistangz/docker_automation"
 registryCredential = "dockerhub"
 dockerImage = ''
 PATH = "$PATH:/usr/local/bin"
}
 agent {
 'docker'}
 stages {
 stage('Cloning our Git') {
 steps {
 git 'https://github.com/naistangz/Docker_Jenkins_Pipeline.git'
 }
 }
 stage('Building Docker Image') {
 steps {
 script {
 dockerImage = docker.build registry + ":$BUILD_NUMBER"
 }
 }
 }
 stage('Deploying Docker Image to Dockerhub') {
 steps {
 script {
 docker.withRegistry('', registryCredential) {
 dockerImage.push()
 }
 }
 }
 }
 stage('Cleaning Up') {
 steps{
 sh "docker rmi $registry:$BUILD_NUMBER"
 }
 }
 }
 }
