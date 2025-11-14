# BMI Project

### A simple application that calculates BMI based on the user inputted height and weight. The project is built with Java Swing and contains a graphical user interface. 

## Features
- **Simple User Interface**

    Contains a simple one-screen interface where users can input their feet, inches, and pounds to calculate their BMI

- **BMI Results**

    Displays BMI categories so that users can see if their BMI is underweight, healthy, overweight, or obese

- **Clear Button**

    Allows users to easily clear any input value with a click of a button

## Technolgies
- **JDK 21** - (see [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21))

- **Swing** - (see [javax.swing](https://docs.oracle.com/javase/8/docs/api/index.html?javax/swing/package-summary.html))

- **Maven** - (see [Maven](https://maven.apache.org/what-is-maven.html))

## Prerequesits
- **JDK 21+**

    To install JDK 21 on Ubuntu, enter the following command

    ```bash
    sudo apt install openJDK-21-jre
    ```

- **Maven**

    To install Maven on Ubuntu, enter the following command

    ```bash
    sudo apt install maven
    ```

## How to Run
1. **Clone or Download the Repository**

    To clone the repository, enter the following command
    
    ```bash
    git clone https://github.com/AdaJoB/BMI-Project.git
    ```

2. **Compile the Project**

    Go to the `BMI/` directory and run the following command

    ```bash
    mvn clean package
    ```

3. **Run the Project**

    Go to the `BMI/` directory and run the following command

    ```bash
    java -jar target/bmi-1.0.jar
    ```
    


## Licence
This sofware is licenced under the **GNU General Public Licence** - (see [GNU GPL v3](https://www.gnu.org/licenses/gpl-3.0.en.html))


## Support

If any issues are encountered with the application, please open an issue on GitHub