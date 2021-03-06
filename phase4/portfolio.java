about.component.html
<div class="section" id="about">
 <div class="container">
 <div class="card" data-aos="fade-up" data-aos-offset="10">
 <div class="row">
 <div class="col-lg-6 col-md-12">
 <div class="card-body">
 <div class="h4 mt-0 title">About Me</div>
 <p align="justify">From a young age, I’ve always had a sense of motivation and 
passion driving me forward. Whether it’s exploring unique opportunities, learning additional skills, or 
meeting new people, I bring these values to every experience throughout my life on a personal and 
professional level.</p>
 <p align="justify">Lover of innovation and everything related to generate new 
knowledge.Face problems with a smile and solve them as soon as possible. Very calculated about 
the time I spend and work I do.</p>
 <p align="justify">To learn more about me, keep exploring my site or reach out 
directly.</p>
 </div>
 </div> 
 <div class="col-lg-6 col-md-12"> 
 <div class="card-body">
 <div class="h4 mt-0 title">Basic Information</div>
 <div class="row">
 <div class="col-sm-4">
 <strong class="text-uppercase">Date of Birth:</strong>
 </div>
 <div class="col-sm-8">Sep 10, 1998</div>
 </div>
 <div class="row mt-4">
 <div class="col-sm-4">
 <strong class="text-uppercase">Email:</strong>
 </div>
 <div class="col-sm-8">rahulkumar.nidamanuri@gmail.com</div>
 </div>
 <div class="row mt-4">
 <div class="col-sm-4">
 <strong class="text-uppercase">Mobile No:</strong>
 </div>
 <div class="col-sm-8">8919236779</div>
 </div>
 <div class="row mt-4">
 <div class="col-sm-4">
 <strong class="text-uppercase">Address:</strong>
 </div>
 <div class="col-sm-8">#201,AVN Residency,Opp.Gayatri Mandir,M.M 
Road,Ongole,523002</div>
 </div>
 <div class="row mt-4">
 <div class="col-sm-4">
 <strong class="text-uppercase">Language:</strong>
 </div>
 <div class="col-sm-8">Telugu,hindhi,English</div>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
</div>
Content.component.html
<div class="section" id="contact">
 <div class="cc-contact-information" style="background-image: url('assets/images/contact.jpg');">
 <div class="container">
 <div class="cc-contact">
 <div class="row">
 <div class="col-md-9">
 <div class="card mb-0" data-aos="zoom-in">
 <div class="h4 text-center title">Contact Me</div>
 <div class="row">
 <div class="col-md-6">
 <div class="card-body">
 <form name="form" (ngSubmit)="f.form.valid ; f.resetForm()" #f="ngForm" novalidate>
 <div class="p pb-3">
 <strong>Feel free to contact me </strong>
 </div>
 <div class="row mb-3">
 <div class="col">
 <div class="input-group">
 <input class="form-control" type="text" name="name" #name placeholder="Name"
 [(ngModel)]="model.name" #name="ngModel"
 [ngClass]="{ 'is-invalid': f.submitted && name.invalid }" required />
 </div>
 </div>
 </div>
 <div class="row mb-3">
 <div class="col">
 <div class="input-container">
 <input class="form-control" type="text" name="subject" #subject 
placeholder="Subject"
 [(ngModel)]="model.subject" #subject="ngModel"
 [ngClass]="{ 'is-invalid': f.submitted && subject.invalid }" required />
 </div>
 </div>
 </div>
 <div class="row mb-3">
 <div class="col">
 <div class="input-group">
 <input class="form-control" type="text" name="email" #email placeholder="Email"
 [(ngModel)]="model.email" #email="ngModel"
 [ngClass]="{ 'is-invalid': f.submitted && email.invalid }"
 pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$" required />
 </div>
 </div>
 </div>
 <div class="row mb-3">
 <div class="col">
 <div class="form-group">
 <textarea class="form-control" name="message" #message placeholder="Your 
Message"
 [(ngModel)]="model.message" #message="ngModel"
 [ngClass]="{ 'is-invalid': f.submitted && message.invalid }" required></textarea>
 </div>
 </div>
 </div>
 <div class="row">
 <div class="col">
 <button class="btn btn-primary" type="submit" (click)="onSubmit(name.value, 
subject.value, email.value, message.value)"> Send</button>
 </div>
 </div>
 </form>
 </div>
 </div>
 <div class="col-md-6">
 <div class="card-body">
 <p class="mb-0">
 <strong>Phone</strong>
 </p>
 <p class="pb-2">+91 8919236779</p>
 <p class="mb-0">
 <strong>Email</strong>
 </p>
 <p>rahulkumar.nidamanuri@gmail.com</p>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
 <ng-snotify class="material"></ng-snotify>
Education.component.html
<div class="section" id="education">
 <div class="container cc-education">
 <div class="h4 text-center mb-4 title">Education</div>
 <div class="card">
 <div class="row">
 <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aosduration="500">
 <div class="card-body cc-education-header">
 <p>2015-2019</p>
 <div class="h5">Bachelor Degree</div>
 </div>
 </div>
 <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aosduration="500">
 <div class="card-body">
 <div class="h4">Bachelor of Engineering</div>
 <h4 class="category">QIS College Of Engineering and Technology</h4>
 <ul>
 <li> QIS College Of Engineering and Technology <b>ranks 2st</b> in 
AndhraPradesh </li>
 <li>Completed B-tech in Computer Science and Engineering with <b>83% 
</b>.</li>
 </ul>
 </div>
 </div>
 </div>
 </div>
 <div class="card">
 <div class="row">
 <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aosduration="500">
 <div class="card-body cc-education-header">
 <p>2013-2015</p>
 <div class="h5">Secondary education</div>
 </div>
 </div>
 <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aosduration="500">
 <div class="card-body">
 <div class="h4">Inter MPC</div>
 <h4 class="category">Sri Chaitanya jr College</h4>
 <ul>
 <li>Completed secondary education with <b>73%</b> aggregate.</li>
 </ul>
 </div>
 </div>
 </div>
 </div>
 <div class="card">
 <div class="row">
 <div class="col-md-3 bg-primary" data-aos="fade-right" data-aos-offset="50" data-aosduration="500">
 <div class="card-body cc-education-header">
 <p>2013</p>
 <div class="h5">Primary education</div>
 </div>
 </div>
 <div class="col-md-9" data-aos="fade-left" data-aos-offset="50" data-aosduration="500">
 <div class="card-body">
 <div class="h5">tel Medium</div>
 <h4 class="category">Damodara Public Schoole</h4>
 <ul>
 <li>Completed with <b>80% </b>aggregate.</li>
 </ul>
 </div>
 </div>
 </div>
 </div>
 </div>
</div>
Footer.component.html
<footer class="footer">
 <div class="container text-center">
 <a class="cc-facebook btn btn-link" href="https://www.facebook.com/Mr.YuvaKeratam/" 
target="_blank">
 <i class="fa fa-facebook fa-2x " aria-hidden="true"></i>
 </a>
 <a class="cc-instagram btn btn-link" href="https://www.instagram.com/mr.yuvakeratam/" 
target="_blank">
 <i class="fa fa-instagram fa-2x " aria-hidden="true"></i>
 </a>
 <a class="cc-github btn btn-link " href="https://https://github.com/NidamanuriRahulKumar/" 
target="_blank">
 <i class="fa fa-github fa-2x " aria-hidden="true"></i>
 </a>
 </div>
 <div class="text-center text-muted">
 <p>&copy; All rights reserved.</p>
 </div>
</footer>
Header.component.html
<header>
 <div class = "profile-page sidebar-collapse">
 <nav class="navbar navbar-expand-lg fixed-top navbar-transparent bg-primary" color-onscroll="400">
 <div class="container">
 <div class="navbar-translate">
 <a class="navbar-brand" href="#" rel="tooltip">Mr.YuvaKeratam</a>
 <button class="navbar-toggler navbar-toggler" type="button" data-toggle="collapse" datatarget="#navigation" aria-controls="navigation" aria-expanded="false" aria-label="Toggle 
navigation">
 <span class="navbar-toggler-bar bar1"></span>
 <span class="navbar-toggler-bar bar2"></span>
 <span class="navbar-toggler-bar bar3"></span>
 </button>
 </div>
 <div class="collapse navbar-collapse justify-content-end" id="navigation">
 <ul class="navbar-nav">
 <li class="nav-item">
 <a class="nav-link smooth-scroll" href="#about">About</a>
 </li>
 <li class="nav-item">
 <a class="nav-link smooth-scroll" href="#skill">Skills</a>
 </li>
 <li class="nav-item">
 <a class="nav-link smooth-scroll" href="#education">Education</a>
 </li>
 
 <li class="nav-item">
 <a class="nav-link smooth-scroll" href="#reference">Reference</a>
 </li>
 
 <li class="nav-item">
 <a class="nav-link smooth-scroll" href="#contact">Contact</a>
 </li>
 </ul>
 </div>
 </div>
 </nav>
 </div>
</header>
Intro.component.html
<div class="profile-page">
 <div class="wrapper">
 <div class="page-header page-header-small" filter-color="orange">
 <div class="page-header-image" data-parallax="true" style="background-image: 
url('assets/images/introduction.jpg');">
 </div>
 <div class="container">
 <div class="content-center">
 <div class="profile-image">
 <a href="#">
 <img src="assets/images/profile.jpg" alt="Image" />
 </a>
 </div>
 <div class="h2 title">Mohammed Arshad</div>
 <p class="category text-white">Java Full STack Developer</p>
 <a class="btn btn-primary smooth-scroll mr-2" href="#contact" data-aos="zoom-in" dataaos-anchor="data-aos-anchor">Hire Me</a>
 <a class="btn btnprimary"href="https://docs.google.com/document/d/1HSVZPYX0c_d6fkFsfNOAAnb3--
LGD2Lo/edit?usp=sharing&ouid=105500183977979454287&rtpof=true&sd=true" target="_blank" 
data-aos="zoom-in" data-aos-anchor="data-aos-anchor">Download CV</a>
 </div>
 </div>
 <div class="section">
 <div class="container">
 <div class="button-container">
 <a class="btn btn-default btn-round btn-lg btn-icon" 
href="https://www.facebook.com/Mr.YuvaKeratam/" target="_blank" rel="tooltip" title="Follow me 
on Facebook">
 <i class="fa fa-facebook"></i>
 </a>
 <a class="btn btn-default btn-round btn-lg btn-icon" 
href="https://www.instagram.com/mr.yuvakeratam/" target="_blank" rel="tooltip" title="Follow 
me on Linkedin">
 <i class="fa fa-linkedin"></i>
 </a>
 <a class="btn btn-default btn-round btn-lg btn-icon" 
href="https://github.com/NidamanuriRahulKumar/" target="_blank" rel="tooltip" title="Follow me 
on Github">
 <i class="fa fa-github"></i>
 </a>
 </div>
 </div>
 </div>
 </div>
 </div>
</div>
Skills.component.html
<div class="section" id="skill">
 <div class="container">
 <div class="h4 text-center mb-4 title">Skills</div>
 <div class="card" data-aos="fade-up" data-aos-anchor-placement="top-bottom">
 <div class="card-body">
 <div class="row">
 <div class="col-md-6">
 <div class="progress-container progress-primary">
 <span class="progress-badge">Java</span>
 <div class="progress">
 <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aosoffset="10"
 data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" 
aria-valuemax="100"
 style="width: 85%;"></div>
 <span class="progress-value">85%</span>
 </div>
 </div>
 </div>
 <div class="row">
 <div class="col-md-6">
 <div class="progress-container progress-primary">
 <span class="progress-badge">Spring Framework</span>
 <div class="progress">
 <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aosoffset="10"
 data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" 
aria-valuemax="100"
 style="width: 70%;"></div>
 <span class="progress-value">70%</span>
 </div>
 </div>
 </div>
 <div class="col-md-6">
 <div class="progress-container progress-primary">
 <span class="progress-badge">Angular8</span>
 <div class="progress">
 <div class="progress-bar progress-bar-striped progress-bar-animated" data-aos="progressfull" data-aos-offset="10"
 data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" 
aria-valuemax="100"
 style="width: 60%;"></div>
 <span class="progress-value">60%</span>
 </div>
 </div>
 </div>
 </div>
 <div class="row">
 <div class="col-md-6">
 <div class="progress-container progress-primary">
 <span class="progress-badge">RDBMS</span>
 <div class="progress">
 <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aosoffset="10"
 data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" 
aria-valuemax="100"
 style="width: 75%;"></div>
 <span class="progress-value">75%</span>
 </div>
 </div>
 </div>
 <div class="col-md-6">
 <div class="progress-container progress-primary">
 <span class="progress-badge">HTML,CSS,JS</span>
 <div class="progress">
 <div class="progress-bar progress-bar-primary" data-aos="progress-full" data-aosoffset="10"
 data-aos-duration="2000" role="progressbar" aria-valuenow="60" aria-valuemin="0" 
aria-valuemax="100"
 style="width: 70%;"></div>
 <span class="progress-value">70%</span>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
 </div>
Index.html
<!doctype html>
<html lang="en">
<head>
 <meta charset="utf-8">
 <title>PersonalPortfoliAngular</title>
 <base href="/">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
 <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
 <link href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" 
rel="stylesheet">
 <link href="assets/css/aos.css" rel="stylesheet">
 <link href="assets/css/bootstrap.min.css" rel="stylesheet">
 <link href="assets/css/main.css" rel="stylesheet">
 <link rel="icon" type="image/x-icon" href="favicon.ico">
</head>
<body>
 <app-root></app-root>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
 <script src="assets/js/core/popper.min.js"></script>
 <script src="assets/js/core/bootstrap.min.js"></script>
 <script src="assets/js/now-ui-kit.js?v=1.3.0"></script>
 <script src="assets/js/aos.js"></script>
 <script src="assets/js/main.js"></script>
</body>
</html>
