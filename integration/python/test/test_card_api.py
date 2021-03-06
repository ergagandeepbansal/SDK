# coding: utf-8

"""
    Hydrogen Integration API

    The Hydrogen Integration API  # noqa: E501

    OpenAPI spec version: 1.2.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import integration_api
from integration_api.api.card_api import CardApi  # noqa: E501
from integration_api.rest import ApiException


class TestCardApi(unittest.TestCase):
    """CardApi unit test stubs"""

    def setUp(self):
        self.api = integration_api.api.card_api.CardApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_card_activate_using_post(self):
        """Test case for create_card_activate_using_post

        Activate card  # noqa: E501
        """
        pass

    def test_create_card_close_using_post(self):
        """Test case for create_card_close_using_post

        close a card  # noqa: E501
        """
        pass

    def test_create_card_issue_using_post(self):
        """Test case for create_card_issue_using_post

        issue a card  # noqa: E501
        """
        pass

    def test_create_card_pin_using_post(self):
        """Test case for create_card_pin_using_post

        pin card  # noqa: E501
        """
        pass

    def test_create_card_reactivate_using_post(self):
        """Test case for create_card_reactivate_using_post

        reactivate card  # noqa: E501
        """
        pass

    def test_create_card_reissue_using_post(self):
        """Test case for create_card_reissue_using_post

        Reissue a card  # noqa: E501
        """
        pass

    def test_create_card_reload_using_post(self):
        """Test case for create_card_reload_using_post

        Create a card reload  # noqa: E501
        """
        pass

    def test_create_card_suspend_using_post(self):
        """Test case for create_card_suspend_using_post

        suspend card  # noqa: E501
        """
        pass

    def test_create_card_token_using_post(self):
        """Test case for create_card_token_using_post

        token card  # noqa: E501
        """
        pass

    def test_create_card_transfer_using_post(self):
        """Test case for create_card_transfer_using_post

        Create Card transfer  # noqa: E501
        """
        pass

    def test_create_card_unload_using_post(self):
        """Test case for create_card_unload_using_post

        Create a card upload  # noqa: E501
        """
        pass

    def test_create_client_card_using_post(self):
        """Test case for create_client_card_using_post

        Create a card client  # noqa: E501
        """
        pass

    def test_get_card_balance_using_get(self):
        """Test case for get_card_balance_using_get

        Get a Card Balance  # noqa: E501
        """
        pass

    def test_get_card_token_using_token(self):
        """Test case for get_card_token_using_token

        Get a card token  # noqa: E501
        """
        pass

    def test_get_card_transaction_using_get(self):
        """Test case for get_card_transaction_using_get

        Get a card transaction  # noqa: E501
        """
        pass

    def test_get_card_using_get(self):
        """Test case for get_card_using_get

        Get a card information  # noqa: E501
        """
        pass

    def test_update_card_pin_using_post(self):
        """Test case for update_card_pin_using_post

        update a pin card  # noqa: E501
        """
        pass

    def test_update_card_using_put(self):
        """Test case for update_card_using_put

        Update a card information  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
