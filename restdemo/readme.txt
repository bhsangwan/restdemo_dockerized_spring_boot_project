This is Demo project for explaining how to run spring boot app on docker container
==================================================================================

This project contains a Dockerfile in its root which is key file

HOW TO RUN ON DOCKER COMMAND LINE
==================================

STEP 1: RUN FOLLOWING COMMAND TO BUiLD AN IMAGE
	
	docker build -t myapp:latest .
	
	-> You can provide any name for tag name followed by .(dot)

STEP 2: RUN BUILT IMAGE IN PREVIOUS STEP
	
	docker run -p 8080:8080 myappp:latest
	
	-> The above command is used to run image and to map host tomcat server port
	 with container's port 