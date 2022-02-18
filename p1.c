#include <stdio.h>
#include <sys/types.h>
#include <unistd.h>
void ChildProcess(); 
void ParentProcess(); 
int main()
{
 pid_t pid;
pid = fork();
if (pid == 0)
ChildProcess();
else
ParentProcess();
return 0; 
}
void ChildProcess()
{
	 printf("I am child process..\n");
	 
printf("Child process Id  :%d \n ",getpid());

}
void ParentProcess()
{ 
printf("I am parent process..\n");

printf("Parent process Id  :%d \n ",getppid());
}
