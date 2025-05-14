# Bug Report: Search Returns Unrelated Items

| Field                 | Value                                 |
| --------------------- | ------------------------------------- |
| **Bug ID**      | BUG002                                |
| **Title**       | "Laptop" search shows unrelated items |
| **Module**      | Product Search                        |
| **Environment** | Firefox 121, macOS Ventura            |
| **Reported By** | Dalonda Ikhimokpa                     |
| **Report Date** | 2024-12-23                            |
| **Severity**    | Medium                                |
| **Priority**    | High                                  |

## Description

Searching for "laptop" displays unrelated products (backpacks, cables) in top results instead of laptops.

## Reproduction Steps

1. Navigate to search bar
2. Enter "laptop"
3. Press Enter or click search icon
4. Observe first page results

## Expected Behavior

- First 10 results should be laptops or laptop accessories
- Relevance score should prioritize laptops

## Actual Behavior

- Top results include backpacks (30% of first page)
- Only 4/10 first results are actual laptops
- Laptop accessories appear after page 2

## Evidence

[SCREENSHOT: Search results for "laptop" showing 3 backpacks in top 5 results]

- [screenshot](/assets/screenshots/Screenshot%202024-12-09%20at%203.57.05 PM.png)
- [screenshot](/assets/screenshots/Screenshot%202024-12-09%20at%204.01.26 PM.png)

## Impact

- Poor customer experience
- Potential lost sales
- Damaged search credibility

## Notes

Reproducible 100% on:

- Desktop browsers (Chrome/Firefox/Safari)
- Mobile app (iOS/Android)
- All marketplace regions

**Tester:** Dalonda Ikhimokpa
**Version:** 1.0
**Log Date:** 2024-12-23
