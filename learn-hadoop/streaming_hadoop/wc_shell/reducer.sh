#!/bin/bash
read currterm currnum
while read term num; do
  if [[ $term = "$currterm" ]]; then
    currnum=$(( currnum + num ))
  else
    printf "%s\t%s\t%s\n" "$currterm" "$currnum"
    currterm="$term"
    currnum="$num"
  fi
done
printf "%s\t%s\t%s\n" "$currterm" "$currnum"

