/***   Global variables   ***/
int pinROJO=13;
int pinAMARILLO=12;
int pinVERDE=11;

/***   Function declaration   ***/

/***   Tasks declaration   ***/

/***   ISR function declaration   ***/

void setup()
{

pinMode(pinVERDE,OUTPUT);
pinMode(pinAMARILLO,OUTPUT);
 pinMode(pinROJO,OUTPUT);
 pinMode(pinROJO,OUTPUT);
}


void loop()
{
    
    digitalWrite(pinVERDE,HIGH);
    delay(4000);
    digitalWrite(pinVERDE,LOW);
    
    for(int i = 0; i< 7; i++) {
      digitalWrite(pinVERDE,HIGH);
    delay(400);
    digitalWrite(pinVERDE,LOW);
    delay(400);
    }
    
    digitalWrite(pinAMARILLO,HIGH);
    delay(3000);
    
    digitalWrite(pinAMARILLO,LOW);
   
    digitalWrite(pinROJO,HIGH);
    delay(3000);
    
    digitalWrite(pinROJO,LOW);
  }

/***   Function definition   ***/