# link-voyager

The link voyager project
Lenguaje: Java (7)
Build System: Maven
Deployed on: Google App Engine


It is the web app that uses a system that explores web pages looking for `<a>` tags and building a site map from those links.
  
For reasons I never updated it, it only works to explore sites on servers that do not have ssl certificates, ergo, only http protocol (without s)
  
This is "paperwork" that can be corrected with a little time...
  
The motivation arises after reading half of the book "Concurrency in Practice" Brian Goetz (friend of the kapo Joshua Block) and wanted to put into trial if concurrency actually served to explore the web faster, creating threads where each one explores an assigned page and coordinating the work so that the same page is not explored twice.
  
Bottom line is: Concurrency DOES improve web scanning. Thanks for your honorships.

I went a little mambo with the abstractions and the code because I was younger and had more desire to delirious with eternal designs.
