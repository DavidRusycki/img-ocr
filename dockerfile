FROM openjdk:11.0

RUN apt-get update -y
RUN apt-get upgrade -y
RUN apt-get install apt-utils -y
RUN apt-get install tesseract-ocr -y
RUN apt-get install tesseract-ocr-por -y
RUN apt-get install tesseract-ocr-eng -y