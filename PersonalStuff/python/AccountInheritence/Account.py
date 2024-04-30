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

    def set_name(self, name):
        self.name = name

    def get_name(self):
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