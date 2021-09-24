#include <iostream>
int main()
	{
		int var;
		int *varptr;

		var = 50;
		varptr = &var;

		std::cout<<var<<"\n";
		std::cout<<varptr;
	}
