# Find Champion II

## LeetCode Problem
- Problem Number: 2924
- Problem Link: https://leetcode.com/problems/find-champion-ii/description/
- Difficulty: Medium
- Topics: Graph, Directed Acyclic Graph (DAG)

## Problem Description
There are n teams numbered from 0 to n - 1 in a tournament; each team is also a node in a DAG (Directed Acyclic Graph).

Given:
- An integer n (number of teams)
- A 0-indexed 2D integer array `edges` of length m representing the DAG
  - `edges[i] = [ui, vi]` indicates a directed edge from team ui to team vi
  - A directed edge from a to b means team a is stronger than team b

A team will be the champion if there is no other team that is stronger than it.

Return:
- The team number that will be the champion if there is a unique champion
- -1 if there is no unique champion

## Examples

### Example 1:

### Notes
- A cycle is a series of nodes a1, a2, ..., an, an+1 where:
  - Node a1 is the same as node an+1
  - Nodes a1, a2, ..., an are distinct
  - There is a directed edge from node ai to node ai+1 for every i in [1, n]
- A DAG is a directed graph that does not have any cycle