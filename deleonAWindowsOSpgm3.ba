@echo off 
::so it doesn't repeat the echos

goto header
**************************************************************
Author    : Alexandria Deleon 
Course    : CGS 3767
Professor : Michael Robinson 
Program # : Number and  program Purpose/Description 
            {The purpose is to familiarize ourselves with the Windows bash }
                
Due Date  : 10/31/2023 
                 
Certification: 
I hereby certify that this work is my own and none of it,
is the work of any other person. 
             
**************************************************************
:header 

echo Alexandria Deleon > results.txt 
echo %date% >> results.txt
echo %time% >> results.txt


:LoopOne   
set /P firstNumber= Enter first number:
if %firstNumber% == 22 goto finishProgram


:LoopTwo 
set /P secondNumber= Enter second number:
if %secondNumber% == 44 goto finishProgram

if %secondNumber% == 0 (
echo "You cannot divide by zero. Enter new number."
goto LoopTwo
)
 
set /A divResult= %firstNumber% / %secondNumber%

echo %firstNumber% divided by %secondNumber% = %divResult%
echo %firstNumber% divided by %secondNumber% = %divResult% >> results.txt
goto LoopOne

:finishProgram