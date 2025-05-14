# 🧪 Test Log - Amazon E-commerce Project

## Test ID: TL-AMZN-002

### Test Case ID: TC-CART-001

### Date: December 20, 2024

### Executed By: Dalonda Ikhimokpa

---

## Test Objective:

Verify cart updates when removing items.

---

## Test Steps:

1. Add product to cart
2. Open cart sidebar
3. Click "Remove" button
4. Observe cart counter

---

## Test Data:

- **Test Product:** Amazon Basics Wireless Mouse
- **Initial Cart Count:** 1

---

## Expected Result:

Cart counter should update to 0 immediately after removal.

---

## Actual Result:

Test Failed: Counter remained at "1" until page refresh.

---

## Status: Fail

---

## Comments:

- UI not updating dynamically
- Reported as BUG001 (Cart sync issue)

**Tester:** Dalonda Ikhimokpa
**Version:** 1.0
**Log Date:** 2024-12-20
