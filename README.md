# PERSONAL PROJECT - ISHIKAWA INVESTING 💵
#### OBJECT ORIENTED PROGRAMMING CLASS
Final project of the Object-Oriented Programming course taught by Professor Dr. José Antonio Gonçalves, in the undergraduate program in Systems Analysis and Development at the Federal Technological University of Paraná, Cornélio Procópio campus.

### Class diagram of the project
![preview](assets/diagramaDeClasses.png)

## Business Rules - Ishikawa Investing 💵

- **RN1**: The system simulates an investment broker, which allows the registration of an investor's assets in a simple way.

- **RN2**: Initially, a menu with the options "Enter" and "Register" will appear
    - **RN2.1**: If the user chooses to register, they will complete their registration
    - **RN2.2**: If they choose to log in, they will only need to enter their CPF and name

- **RN3**: A "home screen" menu will be presented, with the options: 1 - Investments; 2 - My data (there, the user who initially chose to just enter, can complete their registration, and the already registered user can consult and change their information); and 3 - Exit (ends the program).

- **RN4**: In the Investments menu (made based on List/ArrayList) the user will have the following actions: 1 - Register new investment; 2 - List investments; 3 - Consult investment; 4 - Change investment; 5 - Remove investment; 6 - Home;
    - **RN4.1**: In Register new investment, according to the diagram, the user can choose to register between 3 types of assets (Fixed income, Variable income and Cryptocurrencies), they must fill in the following data (inherited by the parent class Investment): Value, Annual Profitability and Liquidity
        - **RN4.1.1**: When choosing Fixed Income, the user must fill in the data: Title, Guarantee and Risk; The Calc interface will return the value of Annual Profitability in relation to the registered Value.
        - **RN4.1.2**: When choosing Variable Income, the user must fill in the data: Code, Number of shares, P/VP and Last profitability; The Calc interface will return the amount paid for Shares in relation to the registered Value.
        - **RN4.1.3**: When choosing Cryptocurrencies, the user must fill in the data: Type, Ticker and Current value. The Calc interface will return the value of the fraction acquired from Cryptoactive in relation to the registered Value.

- **RN5**: In the My Data menu, the user's data will be presented (if registered) and will have the following actions: 1 - Change data; 2 - Home.

-----------------------------------------

## Technologies and Tools
- Java
- Canva
- CMD

### Do you have any feedbacks?
Please contact me! :D

- [E-mail](mailto:l.ishikawacunha@gmail.com)
- [Linkedin](https://www.linkedin.com/in/larissaishikawacunha/)
- [GitHub](https://github.com/larissaiishikawa)  


###### Made with 🤍 by [LARISSA ISHIKAWA](https://github.com/larissaiishikawa)
