<<documentation
**************************************************************
Author    : Alexandria Deleon
Course    : CGS3767
Professor : Michael Robinson 
Program #3 : Number and  program Purpose/Description 
            { The purpose of this program is to make divisions.}
                
Due Date  : 10/31/2023 
                 
Certification: 
I hereby certify that this work is my own and none of it,
is the work of any other person. 
             
**************************************************************
documentation

touch results.txt
echo "Alexandria Deleon" >> results.txt  #puts name into file
echo `date` >> results.txt 

while true
do
    FirstNumber=0;
    SecondNumber=0;
    
    echo "Enter first number: "
    read FirstNumber
    
    if [ $FirstNumber == 33 ]; then
    exit
    fi
    
    echo "Enter second number: "
    read SecondNumber
    
    if [ $SecondNumber == 66 ]; then
    exit
    elif [ $SecondNumber == 0 ]; then
    while [ $SecondNumber == 0 ];
    do
    echo "Can't divide by 0. Enter new number"
    read SecondNumber
    if [ $SecondNumber == 66 ]; then
    exit
    fi
    done
    fi
    
    echo
    
    results=$(($FirstNumber/$SecondNumber))
    
    echo
    
    echo $FirstNumber "divided by" $SecondNumber"=" $results
    echo $FirstNumber "divided by "$SecondNumber"=" $results >> results.txt
    head -1500 hs_alt_HuRef_chr10.fa|grep -o ACGT|wc -l   #searches through 1500 lines of the file and serches for "ACGT"
    
done
    
