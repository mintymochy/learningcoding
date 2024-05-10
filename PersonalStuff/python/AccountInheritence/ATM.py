import random
import math

# Account class :3
class Account:
    def __init__(self, balance=0):
        self.balance = balance
        self.account_id = random.randint(1, 99999)

    def getAccountID(self):
        return self.account_id

    def getBalance(self):
        return self.balance

    def setBalance(self, balance):
        self.balance = balance

    def __str__(self):
        return f"Account ID: {self._account_id}\nBalance: ${self._balance}"

# bank class 
class Bank(Account):
    def __init__(self, balance=0, name="unknown"):
        super().__init__(balance)
        self.name = name
        self.uI = input  # Using input() instead of Scanner for simplicity

    def setName(self, name):
        self.name = name

    def getName(self):
        return self.name

    def deposit(self):
        print("How much do you want to deposit?: ")
        x = float(self.uI())
        self.balance += x
        print("Transaction Completed.")

    def withdrawal(self):
        print("How much do you want to withdraw?: ")
        x = float(self.uI())
        self.balance -= x
        print("Transaction Completed.")

    def __str__(self):
        return f"\nName: {self.name}{super().__str__()}"
    
# Savings Class 
class Savings(Bank):
    def __init__(self, balance=0, name="unknown", interest=0):
        super().__init__(balance, name)
        self.interest = interest

    def getInterest(self):
        return self.interest

    def setInterest(self, interest):
        self.interest = interest

    def months_till_goal(self, st):
        return math.ceil((math.log(st / self.balance)) / (12 * (math.log(1 + (self.interest / 12)))))

    def withdrawal(self, w):
        super().withdrawal()
        if self.balance - w < 0:
            print("Withdrawal amount too high, balance would be negative.")
            return
        self.balance -= w
        print("Transaction completed.")

    def __str__(self):
        return super().__str__() + f"\nInterest: {self.interest}\nSavings balance: {self.balance}"

# Checking class
class Checking(Bank):
    def __init__(self, balance=0, name="unknown", fee = 0):
        super().__init__(balance, name)
        self.fee = fee
        
    def getFee(self):
        return self.fee
    
    def setFee(self, fee):
        self.fee = fee
        
    def withdrawal(self):
        super().withdrawal()
        if self.balance > 0:
            self.balance -= self.fee
            print(f"Fee of ${self.fee} was subtracted as you withdrew too much money.")

    def __str__(self):
        return super().__str__() + f"\nFee: {self.fee}"
    
# Credit class
class Credit(Account):
    def __init__(self, balance=0, apr = 0.0):
        super().__init__(balance)
        self.apr = apr
        
    def getAPR(self):
        return self.apr
    
    def setAPR(self, apr):
        self.apr = apr
    
    def makePurchase(self):
        cost = float(input)("How much is your purchase?: ")
        self.balance + cost
        print("Transaction Completed.")
        
    def monthlyStatement(self):
        print() 
        print(f'balance if paid on time: ${ self.balance}')
        print(f'Balance if not paid on time: ${self.balance * (self.apr / 12)}')
        
    def monthsToPayOff(self):
        m = int(input('How many months do you want to pay this off in?: '))
        r = float(self.apr/12)
        return (int) (math.ceil(self.balance() * ((r * (pow((1 + r), m))) / ((pow((1 + r), m) - 1)))))
        
    def __str__(self):
        return super().__str__() + f'\nAPR: {self.apr}'
    
# ATM class
class ATM: 
    ch = Checking()
    c = Credit()
    s = Savings()
    print('Welcome! Today you will be setting up a credit card account, checking account, and a savings account.')
    name = input('Whats your name!: ')
    tbal = float(input)('What is your checking account balance: ')
    apr = float(input('Enter your APR - (0.XX): '))
    cbal = float(input('What is your credit card balance: '))
    f = float(input('What is your overdraft fee?: '))
    sbal = float(input('What is your savings account balance: '))
    i = float(input('Enter your interest rate - (0.XX): '))
    ch.setBalance(tbal) 
    ch.setName(name)
    ch.setFee(f)
    c.setBalance(cbal)
    c.setapr(apr)
    s.setBalance(sbal)
    s.setInterest(i)
    s.setName(name)
    
    def checking(ch):
        print('\nCredit Options')
        print("1. Check Balance"
			+ "\n2. Make Purchase"
			+ "\n3. Display Monthly Statement"
			+ "\n4. Create Monthly Payments"
			+ "\n5. Back to Main Menu")
        uI = int(input('What do you want to do?: '))
    def savings(s):
        
        
    def credit(c):
        