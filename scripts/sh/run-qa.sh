#!/bin/sh
./gradlew test jacocoReport; gradlew_return_code=$?
if (( $gradlew_return_code != 0 )); then
  exit 1;
fi
if [ -z ${CODECOV_TOKEN+x} ]; then
  echo "skipping reporting coverage to codecov"
else
  bash -c '/bin/bash <(curl -s https://codecov.io/bash)'
fi

