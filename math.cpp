# include<iostream>

int main()
{
	int number;
	int result;
	std::cout<< "Enter number: ";
	std::cin>> number;
	int count = 0;
	int a = 1;
	if(number%2==0)
		{
			for(int i=1;i<21;i++)
			{
				result = i*number;

				std::cout<< i<<" * "<<number<<" = "<<result<<"\n";
			}
		}
	else
		{
					
			for(int j=1;count <30;j++)
			{
				if(j%number!=0)
				{
					std::cout<<j<<"\n";
					count = count +1;
				}
				else
				{
					count = count +0;
				}
			}

				
			
		}



}
