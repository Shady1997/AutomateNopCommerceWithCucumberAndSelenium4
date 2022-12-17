@echo off
set loopcount=5
:loop
echo ...................................................... Hello Shady .....................................................
set /a loopcount=loopcount-1
if %loopcount%==0 goto exitloop
goto loop
:exitloop
echo Starting set up automation environemnt to your machine
timeout 5
echo Done
pause