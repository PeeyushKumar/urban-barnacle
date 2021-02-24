CC=javac
CFLAGS=-d .

JRE=java
JREFLAGS=-cp .:mysql-connector-java-8.0.23.jar



all: src/*
	$(CC) $(CFLAGS) src/*

run: main/*
	$(JRE) $(JREFLAGS) main.Main

clean: main
	rm -rf main/