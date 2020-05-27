# Selenide + TestNG sample
 
  - Before running tests, download chromedriver and place it to the one ot the PATH folders
  (chromedriver executable should be available for launch from command line or terminal)

  
 ## To run tests:
   - Clone the project:
   ```
   git clone https://github.com/dgusakov/selenide_testng_sample.git
   ```
   - Setup your environment. Install `MAVEN`, `JAVA`, download `drivers` and set corresponding system variables
   - Run tests with command:
    ```
    mvn clean test
    ```

Note: there will bw 2 parallel test executed. One should pass by default while the other should fail
 
