cd E:\Build_Project\DemoTestNG
set ProjectPath=E:\Build_Project\DemoTestNG
echo %ProjectPath%
set LibPath=E:\Software
set classpath=%ProjectPath%\bin;%LibPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\TestNG.xml