 # Julian Andres Ceballos Eraso / Estudiante Ingeniería de Sistemas 💻
![Alt](https://www.mejorconweb.com/images/programacion-web-barcelona.jpg)

# 💫 About Me:
 Hi my name is Julian Andres Ceballos Eraso 😁<br>- I have 18 years old 🧑<br>- I’m currently studing on Universidad Mariana 🔭


# 💻 Tech Stack:
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white) ![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
# 📊 GitHub Stats:
![](https://github-readme-stats.vercel.app/api?username=Julian100j&theme=dark&hide_border=false&include_all_commits=false&count_private=false)<br/>
![](https://github-readme-streak-stats.herokuapp.com/?user=Julian100j&theme=dark&hide_border=false)<br/>
![](https://github-readme-stats.vercel.app/api/top-langs/?username=Julian100j&theme=dark&hide_border=false&include_all_commits=false&count_private=false&layout=compact)

## 🏆 GitHub Trophies
![](https://github-profile-trophy.vercel.app/?username=Julian100j&theme=radical&no-frame=false&no-bg=false&margin-w=4)

---
[![](https://visitcount.itsvg.in/api?id=Julian100j&icon=0&color=0)](https://visitcount.itsvg.in)
# Proyecto Java
![Logo Java](https://seeklogo.com/images/J/java-logo-7833D1D21A-seeklogo.com.png)

# Apo2 Funciones.

Se creo un programa con el lenguaje JAVA que le pide al usuario ingresar dos numero enteros y con eos valores generar una suma, resta, multiplicacion y division.  

## Empezando

Las instrucciones se encuentran en los comentarios del codigo para una mejor comprension del mismo.

### Requisitos previos

Instalar una buena IDE en este caso usamos Eclipse:


Link de instalación de Eclipse: https://www.eclipse.org/downloads/


### Instalación

Importar la libreria para que funcione JOptionPane.



import javax.swing.JOptionPane 


## Ejecutando las pruebas


Para ejecutar las pruebas, debemos darle control+f11 o al boton de comenzar para ejecutar el codigo.


### Dividir en pruebas de principio a fin


Este proyecto nos ayuda a solucinar las siguientes operaciones:
Suma, resta, multiplicacion y division
De numeros enteros ingresados por el usuario


### Y pruebas de estilo de codificación.


package proyecto;

package JAVA;

//Se importa una libreria que permite mostrar una interfaz (JOptionPane) 
import javax.swing.JOptionPane;

public class PROYECTO {
	
		public static void main(String[]args) {
			//Se muestra un mensaje al usuario para que digite un valor
			JOptionPane.showMessageDialog(null,"Digite un valor\n");
        	//Se muestra un mensaje para que el usuario ingrese el primer numero en el programa
			int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
	        //Se muestra un mensaje para que el usuario ingrese el segundo numero en el programa
			int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
			
		    //Se define t como suma y como un valor entero
			int t=suma(x,y);
			//Define z como resta y como un valor entero
			int z=resta(x,y);
			//Define m como multiplicacion y como un valor entero
			int m=multiplicacion(x,y);
			//Define d como division y como un valor entero
			int d=division(x,y);
	
			//Se muestra un mensaje de lo que realizo el programa
			JOptionPane.showMessageDialog(null,"El total de la suma es: " + t ,"suma",1);
			JOptionPane.showMessageDialog(null,"El total de la resta es: " + z,"resta",1);
			JOptionPane.showMessageDialog(null,"El total de la multiplicacion es: " + m,"multiplicacion",1);
			JOptionPane.showMessageDialog(null,"El total de la division es: " + d,"division",1);

		}
		    //Esto permite hacer la operacion y retornar en los parametos para poder dar la suma
			public static int suma(int a,int b) {
				return a+b;
			}
			
			//Esto permite hacer la operacion y retornar en los parametos para poder dar la resta
			public static int resta(int x,int y) {
				return x-y;
				
			}
			//Esto permite hacer la operacion y retornar en los parametos para poder dar la multiplicacion 
			public static int multiplicacion(int a,int b) {
				return a*b;
	
		}
			//Esto permite hacer la operacion y retornar en los parametos para poder dar la division
			public static int division(int a,int b) {
				return a/b;
	}
	}



## Despliegue (Deployment)

Este codigo puede usarse como una calculadora en cualquier dispositivo tecnologico.


## Construido con

JOptionPane: Se usa para darle una mejor interfaz al codigo.

## Versionado

Eclipse 2023-09 R

## Autores

* *Nicolas Maya*
* *Julian Ceballos*
* *Santiago Luna* 


## Licencia

Este proyecto tiene la licencia MIT; consulte el archivo LICENSE.md para obtener más detalles.

## Expresiones de gratitud (Acknowledgments)


* Tener conocimiento de retornos en JAVA
* Tener conocimiento de la estructura de JOptionPane






<!--
**Julian100j/Julian100j** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.


