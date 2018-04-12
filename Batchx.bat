cd E:\Build_Project
set ProjectPath=E:\Build_Project
echo %ProjectPath%
set LibPath=E:\Software
set classpath=%ProjectPath%\bin;%LibPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\TestNG.xml