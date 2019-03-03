# Genetic-Algorithm
Solving knapsack problem using Genetic Algorithm in Java

## Introduction

The knapsack problem is popular in the research ﬁeld of constrained and combinatorial optimization, with the aim of selecting items into the knapsack to gain maximum proﬁt while simultaneously not exceeding the knapsack’s capacity. 

Genetic algorithms (GAs) are stochastic search algorithms that mimic the biological process of evolution, enabling thereby users to solve complex optimization problems. They operate based on a population of chromosomes, where a chromosome represents a candidate solution. Genetic operators allow the population to evolve over time and to converge to the optimal solution. 

In the spirit of “survival of the ﬁttest,” GAs are naturally designed to solve maximization problems in which chromosomes with high ﬁtness are more likely to survive and the objective function is termed ﬁtness function. The ﬁtness function is a mathematical expression that evaluates the “quality” of a chromosome and steers the evolutionary search toward high ﬁtness regions in the given search space. Note that the search space is usually a multi-dimensional space that consists of all candidate solutions. 

Two appealing properties of GAs are that they require no derivatives of the objective function and they are capable of achiveving global optimization. The former is in particular useful in situations in which, for example, no derivatives of the objective function exist and hence conventional techniques (like gradient decent methods) cannot be applied. Given an unlimited amount of search time, GAs are able to ﬁnd the global optimum in the search space. That is because they are less likely to get trapped in a local maximum due to their intrinsic stochastic mechanisms.

### Run

The project contains several datasets, each describing knapsack problem of different complexity. In order to run the algorithm, dataset needs to be selected. The following figure depicts finding the optimum solution for dataset containing 10,000 items.


<p align="center"><img src="https://raw.githubusercontent.com/IbrahimMuzaferija/Genetic-Algorithm/master/main.png"></p>
