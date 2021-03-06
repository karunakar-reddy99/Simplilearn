Elasticsearch.yml
---
## Default Elasticsearch configuration from Elasticsearch base image.
## 
https://github.com/elastic/elasticsearch/blob/master/distribution/docker/src/docker/config/elastics
earch.yml
#
cluster.name: "docker-cluster"
network.host: 0.0.0.0
#network.host: localhost
## X-Pack settings
## see https://www.elastic.co/guide/en/elasticsearch/reference/current/security-settings.html
#
xpack.license.self_generated.type: basic
xpack.security.enabled: false
Dockerfile for elasticsearch
ARG ELK_VERSION
# https://www.docker.elastic.co/
FROM docker.elastic.co/elasticsearch/elasticsearch:${ELK_VERSION}
# Add your elasticsearch plugins setup here
# Example: RUN elasticsearch-plugin install analysis-icu
Kibana.yml
## Default Kibana configuration from Kibana base image.
## 
https://github.com/elastic/kibana/blob/master/src/dev/build/tasks/os_packages/docker_generator
/templates/kibana_yml.template.ts
#
server.name: kibana
#server.host: localhost
server.host: 0.0.0.0
elasticsearch.hosts: [ "http://elasticsearch:9200" ]
#elasticsearch.hosts: [ "http://localhost:9200" ]
monitoring.ui.container.elasticsearch.enabled: true
## X-Pack security credentials
#
elasticsearch.username: kibana_system
elasticsearch.password: 'changeme'
Dockerfile for kibana
ARG ELK_VERSION
# https://www.docker.elastic.co/
FROM docker.elastic.co/kibana/kibana:${ELK_VERSION}
# Add your kibana plugins setup here
# Example: RUN kibana-plugin install <name|url>
Logstash.yml
## Default Logstash configuration from Logstash base image.
## https://github.com/elastic/logstash/blob/master/docker/data/logstash/config/logstash-full.yml
#
http.host: "0.0.0.0"
#http.host: "localhost"
Logstash.conf
input {
beats {
port => 5044
}
tcp {
port => 5000
}
}
## Add your filters / logstash plugins configuration here
output {
elasticsearch {
hosts => "elasticsearch:9200"
user => "elastic"
password => "changeme"
}
}
Logstash-laravel.conf
input {
file {
 path => "/tmp/laravel.log"
 start_position => "beginning"
}
}
## Add your filters / logstash plugins configuration here
output {
elasticsearch {
hosts => "elasticsearch:9200"
user => "elastic"
password => "changeme"
}
}
logstash-pellet-db-inserted.conf
input {
file {
 path => "/tmp/pellet-db-inserted.log"
 start_position => "beginning"
}
}
## Add your filters / logstash plugins configuration here
output {
elasticsearch {
hosts => "elasticsearch:9200"
user => "elastic"
password => "changeme"
index => "laravel"
}
}
logstash-pellet-db-processed.conf
input {
file {
 path => "/tmp/pellet-db-processed.log"
 start_position => "beginning"
}
}
## Add your filters / logstash plugins configuration here
output {
elasticsearch {
hosts => "elasticsearch:9200"
user => "elastic"
password => "changeme"
index => "laravel"
}
}
Dockerfile for Logstash
ARG ELK_VERSION
# https://www.docker.elastic.co/
FROM docker.elastic.co/logstash/logstash:${ELK_VERSION}
# Add your logstash plugins setup here
# Example: RUN logstash-plugin install logstash-filter-json
