#LoggerFactory.py

from FileLogger import *
from ConsoleLogger import *

class LoggerFactory():
    """Class that contains factory method."""
    def getLogger(self,x):
        if x==1:
            return FileLogger()
        elif x==2:
            return ConsoleLogger()

    
