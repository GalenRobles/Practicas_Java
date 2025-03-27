//Declaramos los pines que vamos a ocupar
int LedRojo1=8;
int LedRojo2=2;

int LedAmarillo1=10;
int LedAmarillo2=4;

int LedVerde1=12;
int LedVerde2=6;

void setup()
{
  //Declaración de pines para el segundo semáforo
  pinMode(LedRojo2, OUTPUT);//Led Rojo
  pinMode(LedAmarillo2, OUTPUT);//Led Amarillo
  pinMode(LedVerde2, OUTPUT);//Led verde
  
  //Declaración de pines para el primer semáforo
  pinMode(LedRojo1, OUTPUT);//Led Rojo
  pinMode(LedAmarillo1, OUTPUT);//Led Amarillo
  pinMode(LedVerde1, OUTPUT);//Led verde
  
}

void loop()
{
  
  if(digitalRead(LedVerde1)==LOW)//Este if evalua si el pin digital del LedVerde1 es igual LOW
  {
    //Si la condición es verdadera se ejecuta lo siguiente
    
    digitalWrite(LedVerde1,HIGH);//Se prende el LedVerde1
    digitalWrite(LedRojo2,HIGH);//Se prende el LedRojo1
  }
  
  delay(4000);//Esta pausa hace que los pines LedVerde1 y LedRojo1 permanezcan encidos durante 4 segundos
  
  if(digitalRead(LedAmarillo1)==LOW)//Este 'if' evalua el estado del pin LedAmarillo1 
  {
    //Si la condición es verdadera se ejecuta lo siguiente
    
    digitalWrite(LedVerde1,LOW);//Aqui se apaga el LedVerde1, este Led se prendió en el anterior 'if'
    digitalWrite(LedAmarillo1,HIGH);//Se prende el LedAmarillo1
  }
  
  delay(1000);//Esta pausa permite que el LedAmarillo1 este encendido durante 1 segundo  
  
  if(digitalRead(LedRojo1)==LOW)//Este 'if' evalua el estado del LedRojo1
  {

    //Si la condición es verdadera se ejecuta lo siguiente
    
    digitalWrite(LedAmarillo1,LOW);//Se apaga el LedAmarillo1 que se prendió en el 'if' anterior 
    digitalWrite(LedRojo2,LOW);//Se apaga el LedRojo2 que prendimos en el primer 'if'
    digitalWrite(LedRojo1,HIGH);//Se prende el LedRojo1 por primera vez
 
    delay(1000);//Pausa de 1 segundo después que se prendió el LedRojo1
    digitalWrite(LedVerde2,HIGH);//Se enciende el LedVerde2
  }
  
  delay(4000);//Esta pausa nos ayuda a observar que los LedRojo1 y LedVerde2 permanecen encendidos durante 4 segundos
  
  if(digitalRead(LedRojo2)== LOW)//En el 'if' anterior apagamos el LedRojo1, este 'if' evalua el estado del LedRojo2
  {
    //Si la condición es verdadera se ejecuta lo siguiente
    
    digitalWrite(LedRojo1,LOW);//Aquí se apaga el LedRojo1 que encendimos en el 'if' anterior    
    digitalWrite(LedVerde2,LOW);//Aquí apagamos el LedVerde2 que se encendió en la instrucción anterior
    digitalWrite(LedAmarillo2,HIGH);//Se prende el LedAmarillo2  
    delay(1000);//Nos permite ver que el LedAmarillo2 se enciende durante 1 segundo
    
    digitalWrite(LedAmarillo2,LOW);//Se apaga el LedAmarillo2 después de la pausa anterior 
    digitalWrite(LedRojo2,HIGH);//Se prende el LedRojo2 después de la pausa anterior
    delay(1000);//Pausa de 1 segundo
    
    digitalWrite(LedVerde1,HIGH);//Después de la pausa anterior se prende el LedVerde1
  }

}