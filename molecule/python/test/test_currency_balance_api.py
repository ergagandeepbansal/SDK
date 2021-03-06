# coding: utf-8

"""
    Molecule API Documentation

    The Hydrogen Molecule API  # noqa: E501

    OpenAPI spec version: 1.3.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest

import molecule_api
from molecule_api.api.currency_balance_api import CurrencyBalanceApi  # noqa: E501
from molecule_api.rest import ApiException


class TestCurrencyBalanceApi(unittest.TestCase):
    """CurrencyBalanceApi unit test stubs"""

    def setUp(self):
        self.api = molecule_api.api.currency_balance_api.CurrencyBalanceApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_currency_balance_all_using_get(self):
        """Test case for get_currency_balance_all_using_get

        Fetch Currency Balance list  # noqa: E501
        """
        pass

    def test_get_currency_balance_using_get(self):
        """Test case for get_currency_balance_using_get

        Fetch Currency Balance details  # noqa: E501
        """
        pass

    def test_update_currency_balance_using_post(self):
        """Test case for update_currency_balance_using_post

        Update(Fetch) latest Currency Balance  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
