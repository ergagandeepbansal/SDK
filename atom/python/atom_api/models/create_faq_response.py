# coding: utf-8

"""
    Hydrogen Atom API

    The Hydrogen Atom API  # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: info@hydrogenplatform.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six

from atom_api.models.faq_payload import FaqPayload  # noqa: F401,E501
from atom_api.models.faq_payload_faq_keywords import FaqPayloadFaqKeywords  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class CreateFaqResponse(object):
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
        'question': 'str',
        'answer': 'str',
        'category': 'str',
        'subcategory': 'str',
        'is_active': 'bool',
        'number': 'int',
        'seo_name': 'str',
        'faq_keywords': 'list[FaqPayloadFaqKeywords]',
        'is_featured': 'bool',
        'secondary_id': 'SecondaryId',
        'id': 'str',
        'create_date': 'str'
    }

    attribute_map = {
        'question': 'question',
        'answer': 'answer',
        'category': 'category',
        'subcategory': 'subcategory',
        'is_active': 'is_active',
        'number': 'number',
        'seo_name': 'seo_name',
        'faq_keywords': 'faq_keywords',
        'is_featured': 'is_featured',
        'secondary_id': 'secondary_id',
        'id': 'id',
        'create_date': 'create_date'
    }

    def __init__(self, question=None, answer=None, category=None, subcategory=None, is_active=True, number=None, seo_name=None, faq_keywords=None, is_featured=False, secondary_id=None, id=None, create_date=None):  # noqa: E501
        """CreateFaqResponse - a model defined in Swagger"""  # noqa: E501

        self._question = None
        self._answer = None
        self._category = None
        self._subcategory = None
        self._is_active = None
        self._number = None
        self._seo_name = None
        self._faq_keywords = None
        self._is_featured = None
        self._secondary_id = None
        self._id = None
        self._create_date = None
        self.discriminator = None

        self.question = question
        self.answer = answer
        if category is not None:
            self.category = category
        if subcategory is not None:
            self.subcategory = subcategory
        if is_active is not None:
            self.is_active = is_active
        if number is not None:
            self.number = number
        if seo_name is not None:
            self.seo_name = seo_name
        if faq_keywords is not None:
            self.faq_keywords = faq_keywords
        if is_featured is not None:
            self.is_featured = is_featured
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date

    @property
    def question(self):
        """Gets the question of this CreateFaqResponse.  # noqa: E501

        Value for the question in the FAQ  # noqa: E501

        :return: The question of this CreateFaqResponse.  # noqa: E501
        :rtype: str
        """
        return self._question

    @question.setter
    def question(self, question):
        """Sets the question of this CreateFaqResponse.

        Value for the question in the FAQ  # noqa: E501

        :param question: The question of this CreateFaqResponse.  # noqa: E501
        :type: str
        """
        if question is None:
            raise ValueError("Invalid value for `question`, must not be `None`")  # noqa: E501

        self._question = question

    @property
    def answer(self):
        """Gets the answer of this CreateFaqResponse.  # noqa: E501

        Value for the answer to the question in the FAQ  # noqa: E501

        :return: The answer of this CreateFaqResponse.  # noqa: E501
        :rtype: str
        """
        return self._answer

    @answer.setter
    def answer(self, answer):
        """Sets the answer of this CreateFaqResponse.

        Value for the answer to the question in the FAQ  # noqa: E501

        :param answer: The answer of this CreateFaqResponse.  # noqa: E501
        :type: str
        """
        if answer is None:
            raise ValueError("Invalid value for `answer`, must not be `None`")  # noqa: E501

        self._answer = answer

    @property
    def category(self):
        """Gets the category of this CreateFaqResponse.  # noqa: E501

        Category that the FAQ falls under  # noqa: E501

        :return: The category of this CreateFaqResponse.  # noqa: E501
        :rtype: str
        """
        return self._category

    @category.setter
    def category(self, category):
        """Sets the category of this CreateFaqResponse.

        Category that the FAQ falls under  # noqa: E501

        :param category: The category of this CreateFaqResponse.  # noqa: E501
        :type: str
        """

        self._category = category

    @property
    def subcategory(self):
        """Gets the subcategory of this CreateFaqResponse.  # noqa: E501

        Subcategory that the FAQ falls under within a category  # noqa: E501

        :return: The subcategory of this CreateFaqResponse.  # noqa: E501
        :rtype: str
        """
        return self._subcategory

    @subcategory.setter
    def subcategory(self, subcategory):
        """Sets the subcategory of this CreateFaqResponse.

        Subcategory that the FAQ falls under within a category  # noqa: E501

        :param subcategory: The subcategory of this CreateFaqResponse.  # noqa: E501
        :type: str
        """

        self._subcategory = subcategory

    @property
    def is_active(self):
        """Gets the is_active of this CreateFaqResponse.  # noqa: E501

        Indicates if the FAQ is active. Defaults to true which indicates that the FAQ is active  # noqa: E501

        :return: The is_active of this CreateFaqResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active):
        """Sets the is_active of this CreateFaqResponse.

        Indicates if the FAQ is active. Defaults to true which indicates that the FAQ is active  # noqa: E501

        :param is_active: The is_active of this CreateFaqResponse.  # noqa: E501
        :type: bool
        """

        self._is_active = is_active

    @property
    def number(self):
        """Gets the number of this CreateFaqResponse.  # noqa: E501

        Order number of the FAQ. For example 3 indicates it’s the third FAQ in a list. Must be a whole number  # noqa: E501

        :return: The number of this CreateFaqResponse.  # noqa: E501
        :rtype: int
        """
        return self._number

    @number.setter
    def number(self, number):
        """Sets the number of this CreateFaqResponse.

        Order number of the FAQ. For example 3 indicates it’s the third FAQ in a list. Must be a whole number  # noqa: E501

        :param number: The number of this CreateFaqResponse.  # noqa: E501
        :type: int
        """

        self._number = number

    @property
    def seo_name(self):
        """Gets the seo_name of this CreateFaqResponse.  # noqa: E501

        File name used to optimize finding the FAQ in a search engine query  # noqa: E501

        :return: The seo_name of this CreateFaqResponse.  # noqa: E501
        :rtype: str
        """
        return self._seo_name

    @seo_name.setter
    def seo_name(self, seo_name):
        """Sets the seo_name of this CreateFaqResponse.

        File name used to optimize finding the FAQ in a search engine query  # noqa: E501

        :param seo_name: The seo_name of this CreateFaqResponse.  # noqa: E501
        :type: str
        """

        self._seo_name = seo_name

    @property
    def faq_keywords(self):
        """Gets the faq_keywords of this CreateFaqResponse.  # noqa: E501


        :return: The faq_keywords of this CreateFaqResponse.  # noqa: E501
        :rtype: list[FaqPayloadFaqKeywords]
        """
        return self._faq_keywords

    @faq_keywords.setter
    def faq_keywords(self, faq_keywords):
        """Sets the faq_keywords of this CreateFaqResponse.


        :param faq_keywords: The faq_keywords of this CreateFaqResponse.  # noqa: E501
        :type: list[FaqPayloadFaqKeywords]
        """

        self._faq_keywords = faq_keywords

    @property
    def is_featured(self):
        """Gets the is_featured of this CreateFaqResponse.  # noqa: E501

        Indicator for whether or not this is a featured FAQ. Defaults to false indicating it is not featured  # noqa: E501

        :return: The is_featured of this CreateFaqResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_featured

    @is_featured.setter
    def is_featured(self, is_featured):
        """Sets the is_featured of this CreateFaqResponse.

        Indicator for whether or not this is a featured FAQ. Defaults to false indicating it is not featured  # noqa: E501

        :param is_featured: The is_featured of this CreateFaqResponse.  # noqa: E501
        :type: bool
        """

        self._is_featured = is_featured

    @property
    def secondary_id(self):
        """Gets the secondary_id of this CreateFaqResponse.  # noqa: E501


        :return: The secondary_id of this CreateFaqResponse.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this CreateFaqResponse.


        :param secondary_id: The secondary_id of this CreateFaqResponse.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def id(self):
        """Gets the id of this CreateFaqResponse.  # noqa: E501

        ID of the FAQ  # noqa: E501

        :return: The id of this CreateFaqResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this CreateFaqResponse.

        ID of the FAQ  # noqa: E501

        :param id: The id of this CreateFaqResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this CreateFaqResponse.  # noqa: E501

        Datetime the FAQ was created  # noqa: E501

        :return: The create_date of this CreateFaqResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this CreateFaqResponse.

        Datetime the FAQ was created  # noqa: E501

        :param create_date: The create_date of this CreateFaqResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

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
        if issubclass(CreateFaqResponse, dict):
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
        if not isinstance(other, CreateFaqResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other