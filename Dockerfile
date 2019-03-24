FROM centos:centos7
MAINTAINER "andriyzn@gmail.com"
 
COPY .  /app/  

WORKDIR /app

EXPOSE 3000

RUN yum install epel-release -y

RUN yum install python-pip -y

RUN pip install -r /app/app/requirements.txt

ENTRYPOINT [ "python", "/app/app/app.py" ]
