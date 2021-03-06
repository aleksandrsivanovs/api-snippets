#!/usr/bin/env python
# Install the Python helper library from twilio.com/docs/python/install

from twilio.rest import Client

ACCOUNT_SID = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
AUTH_TOKEN = 'your_auth_token'

client = Client(ACCOUNT_SID, AUTH_TOKEN)
user = client.notify.services('ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX') \
             .users.create(identity='User0001',
                           segment=['premium', 'fitness-lifestyle'])

print(user.sid)
