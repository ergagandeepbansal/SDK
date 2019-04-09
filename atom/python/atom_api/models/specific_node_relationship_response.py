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

from atom_api.models.create_node_relationship_response import CreateNodeRelationshipResponse  # noqa: F401,E501
from atom_api.models.secondary_id import SecondaryId  # noqa: F401,E501


class SpecificNodeRelationshipResponse(object):
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
        'id': 'str',
        'create_date': 'str',
        'answer_id': 'str',
        'value': 'str',
        'decision_tree_id': 'str',
        'node_parent_id': 'str',
        'node_child_id': 'str',
        'is_leaf': 'bool',
        'secondary_id': 'SecondaryId',
        'update_date': 'str'
    }

    attribute_map = {
        'id': 'id',
        'create_date': 'create_date',
        'answer_id': 'answer_id',
        'value': 'value',
        'decision_tree_id': 'decision_tree_id',
        'node_parent_id': 'node_parent_id',
        'node_child_id': 'node_child_id',
        'is_leaf': 'is_leaf',
        'secondary_id': 'secondary_id',
        'update_date': 'update_date'
    }

    def __init__(self, id=None, create_date=None, answer_id=None, value=None, decision_tree_id=None, node_parent_id=None, node_child_id=None, is_leaf=None, secondary_id=None, update_date=None):  # noqa: E501
        """SpecificNodeRelationshipResponse - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._create_date = None
        self._answer_id = None
        self._value = None
        self._decision_tree_id = None
        self._node_parent_id = None
        self._node_child_id = None
        self._is_leaf = None
        self._secondary_id = None
        self._update_date = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if create_date is not None:
            self.create_date = create_date
        self.answer_id = answer_id
        self.value = value
        self.decision_tree_id = decision_tree_id
        self.node_parent_id = node_parent_id
        if node_child_id is not None:
            self.node_child_id = node_child_id
        if is_leaf is not None:
            self.is_leaf = is_leaf
        if secondary_id is not None:
            self.secondary_id = secondary_id
        if update_date is not None:
            self.update_date = update_date

    @property
    def id(self):
        """Gets the id of this SpecificNodeRelationshipResponse.  # noqa: E501

        ID of the node relationship  # noqa: E501

        :return: The id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this SpecificNodeRelationshipResponse.

        ID of the node relationship  # noqa: E501

        :param id: The id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: str
        """

        self._id = id

    @property
    def create_date(self):
        """Gets the create_date of this SpecificNodeRelationshipResponse.  # noqa: E501

        Datetime the node relationship was created  # noqa: E501

        :return: The create_date of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: str
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date):
        """Sets the create_date of this SpecificNodeRelationshipResponse.

        Datetime the node relationship was created  # noqa: E501

        :param create_date: The create_date of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: str
        """

        self._create_date = create_date

    @property
    def answer_id(self):
        """Gets the answer_id of this SpecificNodeRelationshipResponse.  # noqa: E501

        The ID of the answer to a question_id that corresponds to the node relationship  # noqa: E501

        :return: The answer_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: str
        """
        return self._answer_id

    @answer_id.setter
    def answer_id(self, answer_id):
        """Sets the answer_id of this SpecificNodeRelationshipResponse.

        The ID of the answer to a question_id that corresponds to the node relationship  # noqa: E501

        :param answer_id: The answer_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: str
        """
        if answer_id is None:
            raise ValueError("Invalid value for `answer_id`, must not be `None`")  # noqa: E501

        self._answer_id = answer_id

    @property
    def value(self):
        """Gets the value of this SpecificNodeRelationshipResponse.  # noqa: E501

        Value of the answer  # noqa: E501

        :return: The value of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """Sets the value of this SpecificNodeRelationshipResponse.

        Value of the answer  # noqa: E501

        :param value: The value of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: str
        """
        if value is None:
            raise ValueError("Invalid value for `value`, must not be `None`")  # noqa: E501

        self._value = value

    @property
    def decision_tree_id(self):
        """Gets the decision_tree_id of this SpecificNodeRelationshipResponse.  # noqa: E501

        The ID of the decision tree to which the node relationship belongs  # noqa: E501

        :return: The decision_tree_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: str
        """
        return self._decision_tree_id

    @decision_tree_id.setter
    def decision_tree_id(self, decision_tree_id):
        """Sets the decision_tree_id of this SpecificNodeRelationshipResponse.

        The ID of the decision tree to which the node relationship belongs  # noqa: E501

        :param decision_tree_id: The decision_tree_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: str
        """
        if decision_tree_id is None:
            raise ValueError("Invalid value for `decision_tree_id`, must not be `None`")  # noqa: E501

        self._decision_tree_id = decision_tree_id

    @property
    def node_parent_id(self):
        """Gets the node_parent_id of this SpecificNodeRelationshipResponse.  # noqa: E501

        The ID for the parent node.  # noqa: E501

        :return: The node_parent_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: str
        """
        return self._node_parent_id

    @node_parent_id.setter
    def node_parent_id(self, node_parent_id):
        """Sets the node_parent_id of this SpecificNodeRelationshipResponse.

        The ID for the parent node.  # noqa: E501

        :param node_parent_id: The node_parent_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: str
        """
        if node_parent_id is None:
            raise ValueError("Invalid value for `node_parent_id`, must not be `None`")  # noqa: E501

        self._node_parent_id = node_parent_id

    @property
    def node_child_id(self):
        """Gets the node_child_id of this SpecificNodeRelationshipResponse.  # noqa: E501

        The ID for the child node.  # noqa: E501

        :return: The node_child_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: str
        """
        return self._node_child_id

    @node_child_id.setter
    def node_child_id(self, node_child_id):
        """Sets the node_child_id of this SpecificNodeRelationshipResponse.

        The ID for the child node.  # noqa: E501

        :param node_child_id: The node_child_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: str
        """

        self._node_child_id = node_child_id

    @property
    def is_leaf(self):
        """Gets the is_leaf of this SpecificNodeRelationshipResponse.  # noqa: E501

        Indicator if the node relationship represents the last point in the decision tree branch. true indicates it is the last point and that is maps to an allocation or model  # noqa: E501

        :return: The is_leaf of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: bool
        """
        return self._is_leaf

    @is_leaf.setter
    def is_leaf(self, is_leaf):
        """Sets the is_leaf of this SpecificNodeRelationshipResponse.

        Indicator if the node relationship represents the last point in the decision tree branch. true indicates it is the last point and that is maps to an allocation or model  # noqa: E501

        :param is_leaf: The is_leaf of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: bool
        """

        self._is_leaf = is_leaf

    @property
    def secondary_id(self):
        """Gets the secondary_id of this SpecificNodeRelationshipResponse.  # noqa: E501


        :return: The secondary_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: SecondaryId
        """
        return self._secondary_id

    @secondary_id.setter
    def secondary_id(self, secondary_id):
        """Sets the secondary_id of this SpecificNodeRelationshipResponse.


        :param secondary_id: The secondary_id of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: SecondaryId
        """

        self._secondary_id = secondary_id

    @property
    def update_date(self):
        """Gets the update_date of this SpecificNodeRelationshipResponse.  # noqa: E501

        Datetime the node relationship was last updated  # noqa: E501

        :return: The update_date of this SpecificNodeRelationshipResponse.  # noqa: E501
        :rtype: str
        """
        return self._update_date

    @update_date.setter
    def update_date(self, update_date):
        """Sets the update_date of this SpecificNodeRelationshipResponse.

        Datetime the node relationship was last updated  # noqa: E501

        :param update_date: The update_date of this SpecificNodeRelationshipResponse.  # noqa: E501
        :type: str
        """

        self._update_date = update_date

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
        if issubclass(SpecificNodeRelationshipResponse, dict):
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
        if not isinstance(other, SpecificNodeRelationshipResponse):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other