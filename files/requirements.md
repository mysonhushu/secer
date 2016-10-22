#Requirements
***
- **user story:**</br>
As a software developer, I need a tool to draw sequence chart in text format. 
The sequence is only contain normal characters.It should be an exe software and
install on my computer. and by typing some simple command and click button to run.
it can be translate into sequence chart.
- **inputs:**</br>
Define some syntax stands for special means.</br>
  + `^` stands for beginning of the script. it MUST follow some actors. seperated by comma, the number of actors is no limited.</br>
  eg:  `^Alice,Bob`</br>
  means the beginning of sequence chart, and the chart only has 2 actors, the first actor is Alice, and the second actor is Bob.the order is important. futher more, the name of actor MUST not contain special characters ("^",",",">","<","$","=","*","!","&",":","~").and all the actors MUST has interactive with others actors.             
  + `>` Stands for message send from left to right. it MUST followed actor position or actor name which list in the first begining line.</br>
  eg: `>1,2:Hello;` or `>Alice,Bob:Hello;`</br>
      means the message send from Alice to Bob, and the message is Hello.
      If the message is a 
  + `<` Stands for message send from right to left. it MUST followed actor postion or actor name which list in the first begining line.</br>
  eg: <1,2:how do you do; or <Alice,Bob:how do you do; </br>
      means the message receive from Alice to Bob. the message is How do you do.
  + `=` Stands for message communicate that outside of this protocol.it MUST followed start point and end point,also include description.</br>
  eg: =1,2:Media communication; or =Alice,Bob:Media communication;
  
      
  
