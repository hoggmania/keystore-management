#!/usr/bin/env bash

BRANCH="$TRAVIS_BRANCH"
if [[ -n "$TRAVIS_PULL_REQUEST_BRANCH" ]]; then
    BRANCH="$TRAVIS_PULL_REQUEST_BRANCH"
    echo "Pull request branch identified: $TRAVIS_PULL_REQUEST_BRANCH"
fi

echo "Sending test results to codecov using $BRANCH"
bash <(curl -s https://codecov.io/bash) -F unittests -B "$BRANCH";