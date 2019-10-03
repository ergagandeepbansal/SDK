# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.1
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from atom_api.models.cash_flow_analysis_response_spending_details_change2 import CashFlowAnalysisResponseSpendingDetailsChange2  # noqa: F401,E501


class CashFlowAnalysisResponseSpendingDetailsByMerchant(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'merchant': 'str',
        'value': 'float',
        'benchmark_value': 'float',
        'change': 'CashFlowAnalysisResponseSpendingDetailsChange2',
        'weight': 'float',
        'benchmark_weight': 'float'
    }

    attribute_map = {
        'merchant': 'merchant',
        'value': 'value',
        'benchmark_value': 'benchmark_value',
        'change': 'change',
        'weight': 'weight',
        'benchmark_weight': 'benchmark_weight'
    }

    def __init__(self, merchant=None, value=None, benchmark_value=None, change=None, weight=None, benchmark_weight=None):  # noqa: E501
        """CashFlowAnalysisResponseSpendingDetailsByMerchant - a model defined in Swagger"""  # noqa: E501

        self._merchant = None
        self._value = None
        self._benchmark_value = None
        self._change = None
        self._weight = None
        self._benchmark_weight = None
        self.discriminator = None

        if merchant is not None:
            self.merchant = merchant
        if value is not None:
            self.value = value
        if benchmark_value is not None:
            self.benchmark_value = benchmark_value
        if change is not None:
            self.change = change
        if weight is not None:
            self.weight = weight
        if benchmark_weight is not None:
            self.benchmark_weight = benchmark_weight

    @property
    def merchant(self):
        """Gets the merchant of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501

        Merchant name as defined in the Nucleus transactions  # noqa: E501

        :return: The merchant of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :rtype: str
        """
        return self._merchant

    @merchant.setter
    def merchant(self, merchant):
        """Sets the merchant of this CashFlowAnalysisResponseSpendingDetailsByMerchant.

        Merchant name as defined in the Nucleus transactions  # noqa: E501

        :param merchant: The merchant of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :type: str
        """

        self._merchant = merchant

    @property
    def value(self):
        """Gets the value of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501

        Sum of all transactions over the period for the given merchant  # noqa: E501

        :return: The value of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :rtype: float
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this CashFlowAnalysisResponseSpendingDetailsByMerchant.

        Sum of all transactions over the period for the given merchant  # noqa: E501

        :param value: The value of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :type: float
        """

        self._value = value

    @property
    def benchmark_value(self):
        """Gets the benchmark_value of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501

        Sum of all transactions over the benchmark period for the given merchant  # noqa: E501

        :return: The benchmark_value of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :rtype: float
        """
        return self._benchmark_value

    @benchmark_value.setter
    def benchmark_value(self, benchmark_value):
        """Sets the benchmark_value of this CashFlowAnalysisResponseSpendingDetailsByMerchant.

        Sum of all transactions over the benchmark period for the given merchant  # noqa: E501

        :param benchmark_value: The benchmark_value of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :type: float
        """

        self._benchmark_value = benchmark_value

    @property
    def change(self):
        """Gets the change of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501


        :return: The change of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :rtype: CashFlowAnalysisResponseSpendingDetailsChange2
        """
        return self._change

    @change.setter
    def change(self, change):
        """Sets the change of this CashFlowAnalysisResponseSpendingDetailsByMerchant.


        :param change: The change of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :type: CashFlowAnalysisResponseSpendingDetailsChange2
        """

        self._change = change

    @property
    def weight(self):
        """Gets the weight of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501

        The proportion of all spending over the period related to this merchant  # noqa: E501

        :return: The weight of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :rtype: float
        """
        return self._weight

    @weight.setter
    def weight(self, weight):
        """Sets the weight of this CashFlowAnalysisResponseSpendingDetailsByMerchant.

        The proportion of all spending over the period related to this merchant  # noqa: E501

        :param weight: The weight of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :type: float
        """

        self._weight = weight

    @property
    def benchmark_weight(self):
        """Gets the benchmark_weight of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501

        The proportion of all spending over the benchmark period related to this merchant  # noqa: E501

        :return: The benchmark_weight of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :rtype: float
        """
        return self._benchmark_weight

    @benchmark_weight.setter
    def benchmark_weight(self, benchmark_weight):
        """Sets the benchmark_weight of this CashFlowAnalysisResponseSpendingDetailsByMerchant.

        The proportion of all spending over the benchmark period related to this merchant  # noqa: E501

        :param benchmark_weight: The benchmark_weight of this CashFlowAnalysisResponseSpendingDetailsByMerchant.  # noqa: E501
        :type: float
        """

        self._benchmark_weight = benchmark_weight

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(CashFlowAnalysisResponseSpendingDetailsByMerchant, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, CashFlowAnalysisResponseSpendingDetailsByMerchant):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other