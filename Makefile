CC=javac
CFLAGS=-d .

JRE=java
JREFLAGS=-cp .:mysql-connector-java-8.0.23.jar



all: src/*
	$(CC) $(CFLAGS) src/*

run: urbanbarnacle/*
	$(JRE) $(JREFLAGS) urbanbarnacle.Main

clean: urbanbarnacle
	rm -rf urbanbarnacle/