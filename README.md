# Втора лабораториска вежба по Софтверско инженерство
# Даниел Илиевски, бр. на индекс 186031

#Група на код:
Ја добив групата на код 5

#Control Flow Graph
![]()

#Цикломатска комплексност

Цикломатската комплексност на овој код е 5, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=4, па цикломатската комплексност изнесува 5. Исто така, ја добив и преку бројот на региони, кој е 5, со што се потврдува првиот резултат

# Тест случаи според критериумот Every statement
Every statement критериумот може да се исполни со само два тест случаи, а тоа се празна низа { } и низата {0, 0, #, 0, #}. Првиот тест случај ни го исполнува првиот if услов, кој ќе биде исполнет само доколку низата е празна. Со вториот случај пак, може да се изминат сите останати statement-и.

# Тест случаи според критериумот Multiple condition statement
 if (list.size() <= 0)
 
 Combination	  Possible test case	   Branch
 
 T	                   {}            B – C
 
 F	             {0, 0, #, 0, #}	     B – D

if (!list.get(i).equals("#"))

Combination	          Possible test case	          Branch

T	                           {#}	                   E – F

F	                           {0}	                   E – K

if (i - 1 >= 0 && list.get(i - 1).equals("#"))

Combination               	Possible test case	              Branch

TT	                         {0, 0, #, ->0, #}	              F – G

TF                           {0, ->0, #, 0, #}                F – H

FX	                         {->0, 0, #, 0, #}	              F - H

//element so -> se zema

if (i + 1 < list.size() && list.get(i + 1).equals("#"))

Combination                	Possible test case	              Branch

TT	                         {0, 0, #, ->0, #}	                H – I

TF	                         {->0, 0, #, 0, #}	                H – J

FX	                        {0, 0, #, 0, #, ->0}	              H – J






