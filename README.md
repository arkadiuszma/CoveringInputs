# Scanner inputs validation
1. Variables written into scanner must be covered with below statements:
- Name: have to starts with uppercase, may contains only from letters with polish characters.
- Login: have to starts with letter, may contains only from lower case letters (without polish signes) and numbers.
- Password: have to had min. 1 sign, may contains of upper and lower case includes polish signs, numbers and special characters.
- E-mail: have to be in <text>@domain type. Text may includes only lower case letters and numbers for example: jk123@example.com.
- Card number: have to contains of 16 - numbers.
2. To change character which is covering sensitive data you have to change coveringSign parameter in criteriaVariables properties.
