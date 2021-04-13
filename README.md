# quotes
# Lab 8 

## How Grader can run this code: 
- the library called Gson were installed in this project, so just you have to clone this project from github.
- after that go to the main method and put the directory of the file you want to read like this"   
`
GettingData[] arrayOfQoutes=readData("app/src/main/resources/recentquotes.json");
        System.out.println(random(arrayOfQoutes));
        `


## quotes Description
Use the file recentquotes.json to show random popular book quotes. Your program should use GSON to parse the .json file. The app needs no functionality other than showing the quote and the author when it is run. The app should choose one quote each time it is run.  

(Code)[app/src/main/java/quotes]  
(Test)[app/src/test/java/quotes]