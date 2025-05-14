
# Amazon Shopping Cart Test Summary Report

## Project Details

- **Project:** Amazon E-commerce Platform
- **Test Plan ID:** AMZN-CART-TP-001
- **Execution Period:** Dec 9-28, 2024
- **Author:** Dalonda Ikhimokpa
- **Report Date:** Dec 31, 2024
- **Version:** 1.0

## 1. Test Execution Summary

| Metric           | Count |
| ---------------- | ----- |
| Total Test Cases | 38    |
| Passed           | 30    |
| Failed           | 6     |
| Blocked          | 2     |
| Pass Rate        | 79%   |

## 2. Defect Summary

| Bug ID  | Description                             | Severity | Status |
| ------- | --------------------------------------- | -------- | ------ |
| BUG-101 | Cart count unchanged after item removal | High     | Open   |
| BUG-102 | "Wireless mouse" shows unrelated items  | Medium   | Open   |

## 3. Key Findings

### BUG-101: Cart Count Issue

**Steps:**

1. Add 3 items
2. Remove 1 item
3. Cart icon still shows "3"
   **Impact:** Users may checkout wrong items

### BUG-102: Search Relevance

**Steps:**

1. Search "wireless mouse"
2. Shows phone cases/cables first
   **Impact:** Poor user experience

## 4. Environment

- **Browsers:** Chrome 121, Firefox 116
- **Environment:** Staging v4.2

## 5. Recommendations

1. Fix cart synchronization (BUG-101)
2. Review search algorithm (BUG-102)
3. Test all cart modification scenarios

## 6. Approval

| Role    | Name              | Date       |
| ------- | ----------------- | ---------- |
| QA Lead | Dalonda Ikhimokpa | 2024-12-31 |

## Author: Dalonda Ikhimokpa

**Date:** Dec 31, 2024
**Version:** 1.0