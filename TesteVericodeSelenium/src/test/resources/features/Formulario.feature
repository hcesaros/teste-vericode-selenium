# language: pt

#Autor: Henrique Cesar
#Data: 28/09/2024


Funcionalidade: Teste automatizado do site Tricentis

    @Test1
    Cenario: Acessar o site da Tricentis
        Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"
        Entao o site é exibido

    @Test2
    Cenario: Realizar o preenchimento do formulario da aba Enter Vehicle Data
        Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"
            E clico na opcao Make
        Entao seleciono a opcao Honda
            E clico na opcao Model
        Quando seleciono a opcao Scooter
            E digito no campo Cylinder Capacity o valor 300
            E digito no campo Engine Performance o valor 150
            E digito no campo Date of Manufacture 12/28/2023
            E clico na opcao Number of Seats
        Quando seleciono no campo Right Hand Drive a opcao Yes
            E seleciono a opcao 2 no campo Number of Seat
            E seleciono a opcao Petrol no campo Fuel Type
            E digito no campo Payload o valor 250
            E digito no campo Total Weight o valor 250
            E digito no campo List Price o valor 5000
            E digito no campo License Plate Number o valor DCO7657
            E digito no campo Annual Mileage o valor 230
        Quando clico no botao Next
        Entao sou redirecionado pra aba Enter Insurant Data

    @Test3
    Cenario: Realizar o preenchimento do formulario da aba Enter Insurant Data
        Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"
        Quando clico na aba Enter Insurant Data
            E digito no campo First Name o nome "Henrique"
            E digito no campo Last Name o sobrenome "Cesar"
            E digito no campo Date of Birth a data "04/16/1985"
            E clico na opcao male no campo Gender
        Entao seleciono a opcao Brazil no campo Country
            E digito no campo Zip Code o cep "03178000"
            E no campo City digito "Sao Paulo"
            E no campo Occupation seleciono a opcao Employee
            E faço o uplod da minha foto
        Quando clico em Next
        Entao sou redirecionado para a aba Enter Product Data









