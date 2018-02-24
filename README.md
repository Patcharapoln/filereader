# Inout-Output Tasks <br />
**By Patcharapol Nirunpornputta** <br />
<br />
I ran a task on MacBook Pro with 2.3 Ghz i5-7360U and got these result:<br />

Task      |  Time
----------|----------
Read file 1-char at a time to String | 0.606073 sec
Read file 1-char at a time to StringBuilder | 0.016909 sec
Read file line at a time using StringBuilder | 0.021058 sec

## Explaination of Results
* **Read file 1 char at a time to Sring** is slowest because when you add a string to computer it will consume your 
computer memory. If you try to add more Strings it will consume more memory and you computer will take more time to do a task.
* **Read file 1 char at a time to SringBuilder** is fastest because StringBuilder have an array of char when you use ``.append()``
it will check space in array are free or not.exceeded the maximum capacity of array char it will increase more memories
and it will consume your computer memory only this time
* **Read file line at a time char at a time using BufferedReader** Actually it should fastest because bufferreader 
read 1 line at time but it collect data in String Therefore it slower than Read to String Builder.
