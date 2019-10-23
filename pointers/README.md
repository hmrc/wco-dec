# How to query my pointer ids

If we want to find out what element is 42A/67A/68A/03A/226, then we can use

```
cat pointer_paths.json | jq '.pointers[] | to_entries |.[] | select(.key == "42A/67A/68A/03A/226")'
```
