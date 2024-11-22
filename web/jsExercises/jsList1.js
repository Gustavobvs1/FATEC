//Exercicio 1
function EX1() {
  let number = 30;
  const string = "ola";
  let boolean = true;

  console.log(string);
  console.log(number);
  console.log(boolean);
}

//Exercicio 2
function EX2(celsius) {
  const fahrenheit = (9 * celsius) / 5 + 32;
  console.log(fahrenheit);
}

//Exercicio 3
function EX3(height, mass) {
  const imc = mass * Math.pow(height, 2);
  console.log(imc);
}

//Exercicio 4
function EX4(number1, operation, number2) {
  switch (operation) {
    case "+":
      console.log(number1 + number2);
      break;
    case "-":
      console.log(number1 - number2);
      break;
    case "*":
      console.log(number1 * number2);
      break;
    case "/":
      console.log(number1 / number2);
      break;
    default:
      console.log("Operação invalida");
      break;
  }
}

//Exercicio 5
function EX5(number) {
  if (number % 2 === 0) console.log("Par");
  else console.log("Impar");
}

//Exercicio 6
function EX6(year) {
  if (year % 4000 === 0 || (year % 4 === 0 && year % 100 !== 0))
    console.log("Bissexto");
  else console.log("Não bissexto");
}

//Exercicio 7
function EX7(age) {
  if (age >= 18) console.log("Pode dirigir");
  else console.log("Não pode dirigir");
}

//Exercicio 8
function EX8(word1, word2) {
  const concat = word1 + word2;
  console.log(concat);
}

//Exercicio 9
function EX9(word) {
  console.log(word.toUpperCase());
}

//Exercicio 10
function EX10(word) {
  console.log(word.toLowerCase());
}

//Exercicio 11
function EX11(name) {
  console.log("Olá " + name);
}
