# Wash Trading Testing Package

### The Problem: 

The world’s been shocked by the fall of FTX, major cryptocurrency exchange. Due to poor accounting, internal processes around accountability, high leverage lending, and a secret backdoor connection with Alameda Research, FTX went from $32 billion company to essentially 0 in the span of a week. Even for those who don’t believe crypto holds value, this has mattered. [$2 billion worth of customer funds, much of which are savings from retail investors, have simply disappeared](https://markets.businessinsider.com/news/currencies/ftx-crypto-billions-customer-funds-missing-collapse-bankruptcy-bankman-fried-2022-11).  

If you’re a crypto skeptic, you should care about making exchanges more transparent so that unsophisticated retail investors aren’t scammed out of their life savings. If you’re a crypto believer, you should also care so decentralisation is achieved meaningfully: through disrupting ‘rent-seeking industries’ instead of [being scammy](https://www.coindesk.com/policy/2022/11/08/us-treasury-adds-to-tornado-cash-sanctions/).  

So, is there a way we can identify ‘fake exchanges’? Specifically, we’ll look for a subset of fake exchanges: ones that inflate their total transaction volume (TTV) with ‘wash trading’, where a single trader buys and sells the same security to generate misleading market information.

To do this, we’ll start by thinking about what real exchanges *******should******* look like, and then apply those heuristics to a couple major exchanges and predict which ones wash trade. 

Sure, if you weren’t working with FTX or Alameda closely, there was no way to predict the events of the last month. But in the future, maybe we can stay away from exchanges that are doing the transaction volume equivalent of [shouting “Bitconnect”](https://www.youtube.com/watch?v=yIL9wLxG01M).
