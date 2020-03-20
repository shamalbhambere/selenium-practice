Feature: Check functionality of Exdp

Background:
Given User enter URL

Scenario Outline: Validate exdp functionality 

Given User is already on page
When User select action "<Action>" drop down
And User enter symbol "<Key>" and select "<Option>"
And User enter qty "<QTY>"
And User enter price "<Price>"
And User enter stop price "<Stop Price>"
And User select "<Order>" type drop down
And User select tif "<TIF>" drop down
And User Enter "<Comment>"
Then User click on submit button
And check data is added in data grid table



Examples:

| Action | Key  | Option | QTY  | Price | Stop Price |   Order  |  TIF  | Comment |
| Buy    | am   |  AMZN  | 1    | 42.3 2| 223.44     |   Limit  |   FOK |egfgwjkfgw |
| Sell   | go   |  GOOGL | 826  | 142.32| 223.44     |   Market |   IOC |evffvwfhwfk|
| Sell   | nf   |  NFLX  | 112  | 342.32| 873        |   Market |   DAY |egsbksbjsdkfgw |
| Buy    | tw   |  TWTR  | 232  | 640.32| 993.44     |   Limit  |   FOK |egfgwjkfgw |
| Buy    | eb   |  EBAY  | 362  | 200.32| 400.44     |   Limit  |   GTC |egfgwjkfgw |
| Buy    | aa   |  AAPL  | 292  | 100   | 223.44     |   Market |   IOC |egfgwjkfgw |
| Sell   | ms   |  MSFT  | 222  | 12.32 | 223.44     |   Limit  |   FOK |egfgwjkfgw |
| Buy    | vz   |  VZ    | 722  | 560.32| 700.44     |   Market |   GTC |egfgwjkfgw |
| Sell   | mm   |  MMM   | 0    | 28.32 | 290.44     |   Limit  |   FOK |egfgwjkfgw |
| Buy    | am   |  AMZN  | 1000 | 690.32| 1000.44    |   Limit  |   DAY |egfgwjkfgw |