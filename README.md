# Hi!
This is my API testing for BLOX.
Right now its a partial project, but most of its basic features functions.It includes anything that is needed in order to create a basic automation testing infrastructure.
This is a maven project, therefore, a basic installation of maven is needed. A good maven installation guide can be found here: https://www.mkyong.com/maven/how-to-install-maven-in-windows/
After the installation is over, use the cmd(or any terminal) to run the tests.Enter the folder which contains the project(and especially the POM file), and write the following command:
mvn test. this command will activates the test. After the tests are done, the report can be found in the reports folder(src/test/Reports) and the latest report will be shown.
Many many tests could be added, but with my time limitation I did my best to create a basic and good enough infrastructure, and to perform some tests on the API service.



General info about the files:

The file that contains the tests is called "TestOne.java".

ReportClassConfig.java is responsible for the reports.

Accounts.java and Wallet.java do spesific requests per feature.

WalletProperties.java parses the requests and make them into usable data.
