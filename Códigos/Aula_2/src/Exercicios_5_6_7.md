### Exercício 5
```java
// Não funciona, pois 'testeSaldo' foi definido em um escopo fechado. 
public class Conta {
    double saldo;
    
    public void calcula() {
        if (saldo < 1000) {
            double testeSaldo = saldo * (0.1);
        }
        System.out.println(testeSaldo);
    }
}
```
### Exercício 6
```java
// Não funciona, pois está atribuindo um valor double a uma int.
public class Conta {
    double saldo;

    public void calcula () {
        if (saldo < 1000) {
            int teste = saldo - 1000;
            if (teste < 0) {
                System.out.println("Deu zebra");
            }
        }
    }
}
```
### Exercício 7
```java
// Não funciona pois saldo é do tipo double, não boolean.
public class Conta {
    double saldo;

    public void calcula() {
        if (saldo) {
            System.out.println("Tem saldo");
        } else {
            System.out.println("Não tem saldo");
        }
    }
}
```