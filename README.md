# Scanner inputs validation
1. Variables written into scanner must be covered with below statements:
- Name: starts with uppercase, contains only from letters with polish characters.
- Login: have to starts with letter, may contains only from lower case letters (without polish signes) and numbers.
- Password: may contains of upper and lower case includes polish signs, numbers and special characters.
- E-mail: must be in <text>@domain type. Text may includes only lower case letters and numbers for example: jk123@example.com.
- Card number: must contains of 16 - numbers.
2. To change character which is covering sensitive data you have to change coveringSign parameter in criteriaVariables properties.
3. To change sensitive keys you have to add or delete parameter in criteriaVariables properties. To properly add parameter enter correct map key value with "," seperator.
