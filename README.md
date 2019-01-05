## Jenkins

```docker
docker run -d -p 8080:8080 -v ~/.jenkins:/var/jenkins_home jenkinsci/blueocean
```

## SonarQube

```docker
docker run -d -p 9000:9000 -v ~/.sonarqube:/opt/sonarqube/data sonarqube
```

- (default) Database: H2 
- (default) Login: admin/admin 

## Using JUnit report

- install jenkins plugin: `PMD Plug-in`
- install jenkins plugin: `Checkstyle Plug-in`

## Using Slack Notification

- install slack app: `Jenkins CI`
- install jenkins plugin: `Slack Notification Plugin` 
- https://jenkins.io/doc/pipeline/steps/slack/#slack-notification-plugin

## Using GitHub WebHook

- add GitHub WebHook URL(~~~~/github-webhook)

## Docker build & run

```docker
docker build -t spring-boot-jenkins .
```

```docker
docker run -d -p 8080:8080 spring-boot-jenkins
```