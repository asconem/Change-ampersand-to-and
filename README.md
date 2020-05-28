-Started off by solving the problem
-Next step testing initial implementation(s)
-Next step considering performance time
-Next step extending functionality to be from taking in one string to taking in list of type String
-Thought problem might be a trap, but decided to use as an opportunity to demonstrate how I think
about edge cases, thoroughness, and execution

   When I initially sat down to begin this challenge, I thought "this seems too easy...all I need to do 
is use the replaceAll() method and I'll be on my way." I thought perhaps it was better to not do this 
particular coding challenge because it might not seem as grand an undertaking as a linked list, or an
iterator that returns only positive integers. However, the more I dug into this challenge the more I
realized that it was the perfect opportunity for me to showcase my detail-oriented nature and show off
how I use critical thinking to dig deeper than just the surface level of a problem.
    I started off as interpreting this problem as just that - "let me use the replaceAll() function 
provided by Java and see if that will work." Sure enough, it did - case closed, turn in the code and
wait for a call back, right? Not exactly - I knew there was more work to be done because there are 
multiple ways to skin this particular cat. There also exists in Java the replace() method, the Pattern/
Matcher way of replacement, and even the Apache Common Lang replace() method. The picture began to come
into focus - The best way to solve this problem was to write out all four implementations and test them 
accordingly in order to find out which was the fastest. 
    After I had my four methods written out, I wrote out four separate JUnit tests to check each one's
performance speed in terms of milliseconds. If I could generate enough meaningful data, I could make an
informed decision about which method was best. A millisecond here and there may not seem like much, but
when the size of inputs begin to increase to that of enterprise level software, those milliseconds are
where companies live or die in terms of profit and loss. I decided for this program, ten tests of each
method was enough. I recorded the results and calculated both a simple average, and an average which 
allowed for the removal of both the high and low outliers. 
    It was at this point I reconsidered the problem upon rereading it - it was apparent I had not
followed the directions, which clearly state the input and output needed to be a List of type String, not
simply one long string. However, the work I had already done was not going to waste! On the contrary, the
testing I had done would allow me to write the best possible method because I had the data to make an
informed decision about which of my original implementations would most efficiently power my new method.
The data informed me that the Pattern/Matcher implementation would work best, so I created a new class 
and method to handle this problem in terms of a List of type String. I wrote out a test for this method
to be absolutely sure it worked as intended even when faced with edge cases.
    In the end, I am very glad I decided to complete this particular coding challenge. What initially
seemed too easy, almost too good to be true actually turned out to be the perfect platform to show off
my individuality not only as a programmer, but as a critical thinker, too. It allowed me to demonstrate 
how I can be thorough with a problem, explore all the details, and use data to execute efficiently and
effectively.
