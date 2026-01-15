# MULTITHREADED-CHAT-APPLICATION

COMPANY : CODTECH IT SOLUTIONS

NAME : M.S.MEYSINTHA

INTERN ID: CTIS0826

DOMAIN: JAVA PROGRAMMING

DURATION : 4 WEEKS

MENTOR: NEELA SANTHOSH

# Description

https://github.com/meysiii/MULTITHREADED-CHAT-APPLICATION

# 👋 Introduction

The project focuses on understanding client–server communication, Java socket programming, and multithreading, which are essential concepts in building real-time network-based applications. This project helped me gain hands-on experience in developing concurrent systems where multiple users can communicate simultaneously.

# 📄 Project Description

The Multithreaded Chat Application is a console-based client–server chat system built using Java sockets and multithreading. The application allows multiple clients to connect to a single server and exchange messages in real time.

The server listens for incoming client connections and creates a separate thread for each connected client, ensuring that all users can send and receive messages simultaneously without blocking each other. When a client sends a message, the server broadcasts it to all connected clients, simulating a real-world group chat environment.

This project demonstrates the core working principles behind real-time chat systems such as online chat rooms and messaging platforms, while keeping the implementation simple, understandable, and beginner-friendly.

# ✨ Features

Real-time chat communication

Supports multiple clients simultaneously

Multithreaded server architecture

Client–server model using Java sockets

Message broadcasting to all connected users

Console-based and beginner-friendly

No external libraries or APIs required

# 🔧 Tech Stack

Java – Core programming language

Java Sockets – Network communication

Multithreading – Handling multiple clients concurrently

Java Collections Framework – Set, HashSet

Object-Oriented Programming (OOP) concepts

# 🚀 How It Works

The server starts and listens on a specific port

Clients connect to the server using sockets

Each client connection is handled using a separate thread

Clients can send and receive messages simultaneously

Messages from one client are broadcast to all connected clients

The server continues running until manually stopped

# 📂 Project Structure

MultithreadedChat/
│── ChatServer.java
│── ClientHandler.java
│── ChatClient.java
│── README.md

# ▶️ How to Run the Project

Clone the repository:

git clone https://github.com/meysiii/MultithreadedChat.git


Navigate to the project directory:

cd MultithreadedChat


Compile the program:

javac *.java


Start the server:

java -cp . ChatServer


Open a new terminal and start a client:

java -cp . ChatClient


Run multiple clients in separate terminals to experience real-time chatting.

# 📊 Sample Output

Server:

🚀 Chat Server started on port 1234
✅ New client connected


Client:

Client: Hello everyone!
Client: Welcome to the chat!

# 📚 Use Cases

Real-time chat applications

Online chat rooms

Client–server communication demos

Networking and multithreading practice

Java internship and academic projects

# 🔮 Future Improvements

Add client usernames

Implement private messaging

Store chat history using files or databases

Add GUI using Java Swing or JavaFX

# OUTPUT




Enhance security using encryption

Convert to web-based chat application
