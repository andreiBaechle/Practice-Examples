#include "stdio.h"

#define CLEAR 1
#define SQMETER_CLEAR 5.00
#define FROSTED 2
#define SQMETER_FROSTED 7.00
#define MINIMUM 5.00

/*
*@Author Andrei Baechle
*
* this method prints the price per square meter of two types of glass.
*/

int main(int argc, char* argv[]){
	double price, area;
	int type;
	printf("Enter glass type: %d (clear) or %d (frosted)> ",CLEAR, FROSTED);
	scanf("%d", &type);
	printf("Enter area in square meters> ");
	scanf("%lf", &area);
	
	
	if (type == CLEAR){
		price = SQMETER_CLEAR*area;
	}else if(type == FROSTED){
		price = SQMETER_FROSTED*area;
	}
			
	if (price< MINIMUM){
		price = MINIMUM;
	}
	
	
	printf("Glass price is $%.2f\n", price);
		
	return (0);
}

